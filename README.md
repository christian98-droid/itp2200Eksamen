itp2200 Eksamen

The root folder is "itp2200Eksamen"
src folder is "itp2200Eksamen/ITP2200ExamTest/src"
We have used Junit (org.junit.jupiter:junit-jupiter:5.4.2) to conduct our testing
The different jar-files can be located in "itp2200Eksamen/ITP2200ExamTest/junit" OR be imported through Maven using the
full name provided above.

Run/Debug configurations for both Testing and ExerciseManager should be automatically be imported.
However if the need to do it again:
To run the test with coverage, Open the Run/Debug Configurations and add new Junit configuration. 
Select Test Kind: Package and locate the Tests folder found on "itp2200Eksamen/ITP2200ExamTest/src/Tests".
On the Code Coverage section, select the package HomeExerciseProgram.
Also make sure to select "itp2200Eksamen" on the Use classpath of module in the Configuration section.

Exercise Manager is an application developed to help you stay fit at home. This tool gives you access to a variety of
different exercises of your personal preferred intensity. You can also create your own exercises and build your very own
exercise programs. If you choose one of the existing programs, the users preferred intensitylevel determines the
program's duration and intensity.
The application reads input from a Scanner, which makes Exercise Manager very easy to use.