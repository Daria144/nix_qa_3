package ua.com.alevel;

import org.apache.commons.lang.StringUtils;

public class StringRun {

    public void run() {
        String s = "  \n";

        System.out.println("Empty = " + s.isEmpty());
        System.out.println("Blank = " + !s.isBlank());
        System.out.println("Blank = " + StringUtils.isNotBlank(s));

        s = "test";

        String rep = s.replace('t', 'i');
        System.out.println("rep = " + rep);

        System.out.println("s = " + s.indexOf("el"));
        if (s.indexOf("t") >= 0) {
            System.out.println("s = " + s);
        }

        if (s.contains("a")) {
            System.out.println("s = " + s);
        }

        if (StringUtils.contains(s, "a")) {
            System.out.println("s = " + s);
        }

        s = "test aaa";
        String[] strings = s.split(" ");
        System.out.println("strings = " + strings.length);

        String sub = s.substring(3, 6);
        System.out.println("sub = " + sub);

        String email = "    test@gmail.com  ";
        System.out.println("email = " + email);
        email = email.trim();
        System.out.println("email = " + email);
        System.out.println("email = " + email.toUpperCase());

        System.out.println("email = " + email.startsWith("teg"));

        User user = new User();
        user.setEmail("email");
        String query = "select * from users where ";
        if (StringUtils.isNotBlank(user.getEmail())) {
            query = query.concat(" email like %" + user.getEmail() +"%");
        }
        if (StringUtils.isNotBlank(user.getFirstName())) {
            query = query.concat(" firstName like %" + user.getEmail() +"%");
        }
        System.out.println("query = " + query);

        StringBuilder queryBuilder = new StringBuilder("select * from users");
        if (StringUtils.isNotBlank(user.getEmail())) {
            queryBuilder.append(" email like %" + user.getEmail() +"%");
        }
        if (StringUtils.isNotBlank(user.getFirstName())) {
            queryBuilder.append(" firstName like %" + user.getEmail() +"%");
        }
        System.out.println("queryBuilder = " + queryBuilder.toString());

        StringBuilder reverse = new StringBuilder("qwert");
        System.out.println("reverse = " + reverse.reverse());

        String numbers = "42423412gfdsgfds54325";
        String repl = numbers.replaceAll("[^0-9]", "");
        System.out.println("repl = " + repl);

        String str="This#string%contains^special*characters&.";
        str = str.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(str);
    }
}
