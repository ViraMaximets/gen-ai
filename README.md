<h2>JUnit Test Description</h2>

<p>
The test suite for this Spring-Maven project is designed to comprehensively assess the functionality and robustness of the <b>StudentConverter</b> and <b>PlayerAnalyzer</b> classes. For the <b>StudentConverter</b> class, the tests cover various scenarios that one might encounter when converting <b>Student</b> objects. For example, the <code>testConvertStudents_ExceptionalCase</code> test deals with edge cases, while <code>testConvertStudents_HonorRollCase</code> checks whether students qualifying for the honor roll are processed correctly. Other tests like <code>testConvertStudents_PassedCase</code>, <code>testConvertStudents_NotPassedCase</code>, <code>testConvertStudents_EmptyList</code>, and <code>testConvertStudents_NullInput</code> ensure that the class works as expected for students in different academic statuses and for various edge cases such as empty lists or null inputs.
</p>

<p>
Similarly, the <b>PlayerAnalyzer</b> class is rigorously tested to calculate the scores of <b>Player</b> objects based on varying conditions. For instance, <code>testCalculateScore_SinglePlayer</code> checks the score calculation for a single player while tests such as <code>testCalculateScore_SinglePlayer_Age25</code>, <code>testCalculateScore_SinglePlayer_Age15</code>, and <code>testCalculateScore_SinglePlayer_Age35</code> verify that the age-based logic in score calculations works correctly. More complex scenarios like handling multiple players (<code>testCalculateScore_MultiplePlayers</code>) or encountering null or empty skill sets (<code>testCalculateScore_NullSkills_ShouldThrowError</code>, <code>testCalculateScore_EmptyArray_ShouldReturnZero</code>) are also tested to ensure the method's robustness.
</p>

<h2>Running Tests Locally</h2>

<ol>
  <li><b>Prerequisite</b>: Make sure you have Maven and Java installed on your system. If not, you can install them from their respective official websites.</li>

  <li><b>Clone the Repository</b>: If you haven't already, clone the project repository to your local machine.
    <pre>git clone &lt;repository_url&gt;</pre>
  </li>

  <li><b>Navigate to the Project Directory</b>: Use the terminal to navigate to the root directory of the cloned project.
    <pre>cd &lt;project_directory&gt;</pre>
  </li>

  <li><b>Run the Tests</b>: Execute the following Maven command to run all the JUnit tests.
    <pre>mvn test</pre>
  This command compiles the project and runs all the JUnit tests defined in your test classes. Maven will automatically download any required dependencies.
  </li>

  <li><b>Review Test Results</b>: After running the tests, you will see output in the terminal indicating whether the tests passed or failed. Detailed logs can also be found in the <code>target/surefire-reports</code> directory within your project folder.</li>
</ol>
