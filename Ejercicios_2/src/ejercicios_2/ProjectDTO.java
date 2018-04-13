/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_2;

/**
 *
 * @author DGarcia
 */

    
    public class ProjectDTO {    
	private final int id;
    private final String name;
    private final String description;
    private final String directory;
    private final String databasePath;
    private final String blockModelPath;
    private final String pitDesignPath;
    private final Double benchHeight;
    private final Double flitchHeight;
    private final String interpolationMethod;
    private final Double minBlockSizeCoordX;
    private final Double minBlockSizeCoordY;
    private final Double minBlockSizeCoordZ;
    private final Double rotationCoordX;
    private final Double rotationCoordY;
    private final Double rotationCoordZ;
 
    public ProjectDTO(int id,String name, String description, String directory,
                      String databasePath, String blockModelPath, String pitDesignPath,
                      Double benchHeight, Double flitchHeight, String interpolationMethod,
                      Double minBlockSizeCoordX, Double minBlockSizeCoordY,
                      Double minBlockSizeCoordZ, Double rotationCoordX, Double rotationCoordY,
                      Double rotationCoordZ) {        this.id = id;
        this.name = name;
        this.description = description;
        this.directory = directory;
        this.databasePath = databasePath;
        this.blockModelPath = blockModelPath;
        this.pitDesignPath = pitDesignPath;
        this.benchHeight = benchHeight;
        this.flitchHeight = flitchHeight;
        this.interpolationMethod = interpolationMethod;
        this.minBlockSizeCoordX = minBlockSizeCoordX;
        this.minBlockSizeCoordY = minBlockSizeCoordY;
        this.minBlockSizeCoordZ = minBlockSizeCoordZ;
        this.rotationCoordX = rotationCoordX;
        this.rotationCoordY = rotationCoordY;
        this.rotationCoordZ = rotationCoordZ;
    }    public int getId() {        return id;
    }    public String getName() {        return name;
    }    public String getDescription() {        return description;
    }    public String getDirectory() {        return directory;
    }    public String getDatabasePath() {        return databasePath;
    }    public String getBlockModelPath() {        return blockModelPath;
    }    public String getPitDesignPath() {        return pitDesignPath;
    }    public Double getBenchHeight() {        return benchHeight;
    }    public Double getFlitchHeight() {        return flitchHeight;
    }    public String getInterpolationMethod() {        return interpolationMethod;
    }    public Double getMinBlockSizeCoordX() {        return minBlockSizeCoordX;
    }    public Double getMinBlockSizeCoordY() {        return minBlockSizeCoordY;
    }    public Double getMinBlockSizeCoordZ() {        return minBlockSizeCoordZ;
    }    public Double getRotationCoordX() {        return rotationCoordX;
    }    public Double getRotationCoordY() {        return rotationCoordY;
    }    public Double getRotationCoordZ() {        return rotationCoordZ;
    }    @Override    public String toString() {        return "ProjectDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", directory='" + directory + '\'' +
                ", databasePath='" + databasePath + '\'' +
                ", blockModelPath='" + blockModelPath + '\'' +
                ", pitDesignPath='" + pitDesignPath + '\'' +
                ", benchHeight=" + benchHeight +
                ", flitchHeight=" + flitchHeight +
                ", interpolationMethod='" + interpolationMethod + '\'' +
                ", minBlockSizeCoordX=" + minBlockSizeCoordX +
                ", minBlockSizeCoordY=" + minBlockSizeCoordY +
                ", minBlockSizeCoordZ=" + minBlockSizeCoordZ +
                ", rotationCoordX=" + rotationCoordX +
                ", rotationCoordY=" + rotationCoordY +
                ", rotationCoordZ=" + rotationCoordZ +
                '}';
    }    public static class Builder{        private int id;
        private String name;
        private String description;
        private String directory;
        private String databasePath;
        private String blockModelPath;
        private String pitDesignPath;
        private Double benchHeight;
        private Double flitchHeight;
        private String interpolationMethod;
        private Double minBlockSizeCoordX;
        private Double minBlockSizeCoordY;
        private Double minBlockSizeCoordZ;
        private Double rotationCoordX;
        private Double rotationCoordY;
        private Double rotationCoordZ;
 
        public Builder id(int id){            this.id = id;
            return this;
        }        public Builder name(String name){            this.name = name;
            return this;
        }        public Builder description(String description){            this.description = description;
            return this;
        }        public Builder directory(String directory){            this.directory = directory;
            return this;
        }        public Builder databasePath(String dbPath){            this.databasePath = dbPath;
            return this;
        }        public Builder blockModelPath(String blockModelPath){            this.blockModelPath = blockModelPath;
            return this;
        }        public Builder pitDesignPath(String pitDesignPath){            this.pitDesignPath = pitDesignPath;
            return this;
        }        public Builder benchHeight(Double benchHeight){            this.benchHeight = benchHeight;
            return this;
        }        public Builder flitchHeight(Double flitchHeight){            this.flitchHeight = flitchHeight;
            return this;
        }        public Builder interpolationMethod(String interpolationMethod){            this.interpolationMethod = interpolationMethod;
            return this;
        }        public Builder minBlockSizeCoordX(Double minBlockSizeCoordX){            this.minBlockSizeCoordX = minBlockSizeCoordX;
            return this;
        }        public Builder minBlockSizeCoordY(Double minBlockSizeCoordY){            this.minBlockSizeCoordY = minBlockSizeCoordY;
            return this;
        }        public Builder minBlockSizeCoordZ(Double minBlockSizeCoordZ){            this.minBlockSizeCoordZ = minBlockSizeCoordZ;
            return this;
        }        public Builder rotationCoordX(Double rotationCoordX){            this.rotationCoordX = rotationCoordX;
            return this;
        }        public Builder rotationCoordY(Double rotationCoordY){            this.rotationCoordY = rotationCoordY;
            return this;
        }        public Builder rotationCoordZ(Double rotationCoordZ){            this.rotationCoordZ = rotationCoordZ;
            return this;
        }        public ProjectDTO build(){            return new ProjectDTO(this);
        }    }    private ProjectDTO(Builder builder){        id = builder.id;
        name = builder.name;
        description = builder.description;
        directory = builder.directory;
        databasePath = builder.databasePath;
        blockModelPath = builder.blockModelPath;
        pitDesignPath = builder.pitDesignPath;
        benchHeight = builder.benchHeight;
        flitchHeight = builder.flitchHeight;
        interpolationMethod = builder.interpolationMethod;
        minBlockSizeCoordX = builder.minBlockSizeCoordX;
        minBlockSizeCoordY = builder.minBlockSizeCoordY;
        minBlockSizeCoordZ = builder.minBlockSizeCoordZ;
        rotationCoordX = builder.rotationCoordX;
        rotationCoordY = builder.rotationCoordY;
        rotationCoordZ = builder.rotationCoordZ;
    }
    
    }
/*lo mismo en C#

public class ProjectDTO {    
	readonly int id {get ; private set};
    readonly String name {get ; private set};
    readonly String description {get ; private set};
    readonly String directory {get ; private set};
    readonly String databasePath {get ; private set};
    readonly String blockModelPath {get ; private set};
    readonly String pitDesignPath {get ; private set};
    readonly Double benchHeight {get ; private set};
    readonly Double flitchHeight {get ; private set};
    readonly String interpolationMethod {get ; private set};
    readonly Double minBlockSizeCoordX {get ; private set};
    readonly Double minBlockSizeCoordY {get ; private set};
    readonly Double minBlockSizeCoordZ {get ; private set};
    readonly Double rotationCoordX {get ; private set};
    readonly Double rotationCoordY {get ; private set};
    readonly Double rotationCoordZ {get ; private set};
 
	public ProjectDTO(int id,String name, String description, String directory = "",
                      String databasePath = "", String blockModelPath = "", String pitDesignPath = "",
                      Double benchHeight = 0, Double flitchHeight = 0, String interpolationMethod = "",
                      Double minBlockSizeCoordX = 0, Double minBlockSizeCoordY = 0,
                      Double minBlockSizeCoordZ = 0, Double rotationCoordX = 0, Double rotationCoordY = 0,
                      Double rotationCoordZ = 0) {        this.id = id;
        this.name = name;
        this.description = description;
        this.directory = directory;
        this.databasePath = databasePath;
        this.blockModelPath = blockModelPath;
        this.pitDesignPath = pitDesignPath;
        this.benchHeight = benchHeight;
        this.flitchHeight = flitchHeight;
        this.interpolationMethod = interpolationMethod;
        this.minBlockSizeCoordX = minBlockSizeCoordX;
        this.minBlockSizeCoordY = minBlockSizeCoordY;
        this.minBlockSizeCoordZ = minBlockSizeCoordZ;
        this.rotationCoordX = rotationCoordX;
        this.rotationCoordY = rotationCoordY;
        this.rotationCoordZ = rotationCoordZ;
    }*/

    

