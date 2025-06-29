# CS-305 Module Eight Journal: Project Two Reflection

**Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?**

The client for this project was Artemis Financial, a company that runs a financial web application. They asked for help improving the security of their existing software. The main issue they wanted me to address was making sure the application followed secure coding practices and could protect sensitive data. They were looking for a security review that would identify weaknesses in the code and apply best practices to strengthen the application.

**What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?**

I think I did well at spotting specific problems like weak encryption, hardcoded credentials, and lack of input validation. I applied secure coding fixes that followed best practices from the course and the _Iron-Clad Java_ textbook. Coding securely is important because insecure applications can lead to serious problems like data theft or service outages. For a company, good software security builds trust with users and helps prevent expensive incidents like breaches or lawsuits.

**Which part of the vulnerability assessment was challenging or helpful to you?**

One of the most helpful parts was learning how to identify insecure patterns in real code and replace them with safer alternatives. For example, using AES instead of MD5 or removing sensitive values from the codebase. A challenging part was deciding which issues to prioritize when there were several at once. It helped me practice thinking like a security-focused developer.

**How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?**

I added multiple layers of security by using strong encryption, applying input validation, removing hardcoded secrets, and checking for proper access controls. In the future, I would continue using static analysis tools like OWASP Dependency Check and research vulnerabilities using the National Vulnerability Database (NVD). I would also compare CVE information to choose the best ways to mitigate each risk based on severity and exploitability.

**How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?**

After I made changes, I tested the application to confirm it still worked as expected. I also manually reviewed the updated code to make sure the new logic was secure. I re-ran the OWASP scan to check for known issues and used what I learned in class to double-check that I didn’t create new vulnerabilities, especially in areas like input handling and encryption.

**What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?**

I used OWASP Dependency Check, Java’s `SecureRandom` and `MessageDigest` classes, and environment variables for storing sensitive data. These tools and practices were really helpful and I plan to keep using them in future assignments. I also followed guidelines from _Iron-Clad Java_ (Detlefsen & Manico, 2015), especially from Chapter 3 (Access Control) and Chapter 6 (Protecting Sensitive Data), which helped me write more secure code.

**Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?**

I would show future employers the Artemis Financial Practices for Secure Software Report because it includes a full analysis of real security issues and shows how I fixed them. It proves I can identify risks, use best practices, and write secure, working code. It also shows that I can apply industry standards and tools to solve real software problems in a professional way.
