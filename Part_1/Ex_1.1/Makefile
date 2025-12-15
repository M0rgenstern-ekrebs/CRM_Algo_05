MAIN = App
OUT_DIR = out

SRC = $(shell find src -name "*.java")
JFLAGS = -Xlint:all -Werror

all: $(OUT_DIR)/classes

$(OUT_DIR)/classes:
	mkdir -p $(OUT_DIR)
	javac $(JFLAGS) -d $(OUT_DIR) $(SOURCES)

run: all
	java -cp $(OUT_DIR) $(MAIN)

clean:
	rm -rf $(OUT_DIR)