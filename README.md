# Smart Home IoT Simulation Engine

A polymorphic desktop simulation platform designed to abstract, monitor, and persist runtime configurations for heterogeneous Internet of Things (IoT) hardware peripherals. Engineered as a 3rd-semester academic milestone for the Object-Oriented-Programming (OOP) curriculum, the system demonstrates object-oriented design principles, clean behavioral mapping, and flat-file object-graph serialization.

---

## Architectural Subsystems

### 1. Polymorphic Hierarchy & Domain Modeling

To decouple system control layers from individual machine features, the application relies on an abstract base framework:

* **`SmartDevice` Base Specification:** Declares shared, serializable hardware state indicators (`name`, `state`) and standard getter/setter access constraints.
* **Peripheral Concrete Specializations:** Subclasses extend the base runtime payload to model specialized hardware behaviors:
* `LightBulb`: Incorporates programmatic brightness boundary enforcement ($0 \le x \le 100$) and color hex/string buffers.
* `Fan`: Implements explicit discrete speed states ($0 \le x \le 5$).
* `Thermostat`: Tracks double-precision scalar temperature constants.
* `Camera`: Tracks high-definition media compression types and target file containers.



### 2. State Persistence Engine

Object collection lifetimes are handled through Java's native Object Serialization architecture. Rather than introducing external database dependency graphs, runtime state collections (`ArrayList<SmartDevice>`) are serialized as binary streams directly to disk (`Devices.ser`) during the exit event lifecycle. Upon startup, the stream layer initializes deserialization pipelines, safely casting bytes back to active system definitions.

### 3. Asynchronous Event-Driven GUI Framework

The interface layer is built using the Java Swing/AWT ecosystem. Visual parameters are laid out using precise coordinate bounds (absolute layout pattern) within custom panels. The backdrop layer overrides the core canvas drawing matrix (`paintComponent`) to perform alpha-blended geometric operations over hardware-accelerated image scaling operations.

---

## Structural Blueprint

The codebase uses a explicit package structure bounded to the `src` namespace declaration. Class dependencies are organized as follows:

```text
└── ukasha167-smart-home-app/
    ├── imgs/
    │   └── background.jpg     # UI structural canvas asset
    └── src/                   # Package namespace root
        ├── App.java           # Central controller and window layout state
        ├── Camera.java        # Concrete target hardware implementation
        ├── Fan.java           # Concrete target hardware implementation
        ├── LightBulb.java     # Concrete target hardware implementation
        ├── Main.java          # Simulation lifecycle entry point
        ├── SmartDevice.java   # Abstract hardware spec interface
        └── Thermostat.java    # Concrete target hardware implementation

```

---

## Build & Execution Pipeline

Because the classes utilize an explicit package name namespace (`package src;`), the Java Virtual Machine requires compiled binaries to match their directory paths. Follow this build sequence to ensure correct compilation:

### 1. Clean Compilation

Compile all package dependencies from the project root folder (`ukasha167-smart-home-app`) into a target binary output structure:

```bash
# Initialize clean binary targets
rm -rf bin
mkdir -p bin

# Compile package dependency trees
javac -d bin src/*.java

```

### 2. Verification of Binary Structure

Verify that the output bytecode artifacts match the package directory footprint requirements:

```bash
ls -R bin
# Output should indicate nested placement: bin/src/*.class

```

### 3. Runtime Invocation

Execute the compilation environment by directing the classpath pointer (`-cp`) to the root of the binary folder, specifying the **fully qualified class name** (`src.Main`):

```bash
java -cp bin src.Main

```
