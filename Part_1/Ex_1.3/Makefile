MAIN = test/App
OUT_DIR = out

SOURCES = $(shell find src/** -name "*.java")
JFLAGS = -Xlint:all -Werror

all: clear $(OUT_DIR)/classes

$(OUT_DIR)/classes:
	mkdir -p $(OUT_DIR)
	javac $(JFLAGS) -d $(OUT_DIR) $(SOURCES)

run: all
	java -cp $(OUT_DIR) $(MAIN)

clean:
	rm -rf $(OUT_DIR)

clear:
	clear

re: clean all