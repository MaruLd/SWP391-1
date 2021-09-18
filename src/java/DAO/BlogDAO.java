package DAO;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Utils.DBHelpers;
import java.sql.Date;

public class BlogDAO implements Serializable {

    public static boolean createBlog(BlogDTO dto) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;

        try {
            // 1. Connect DB
            con = DBHelpers.makeConnection();
            // 2. Create SQL String
            if (con != null) {
                String sql = "INSERT INTO Blog (title, content, postDate, categoryID, status, hasAttachment, tags, ownerID) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                // 3. Create statement object
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.getTitle());
                stm.setString(2, dto.getContent());
                stm.setDate(3, dto.getPostDate());
                stm.setString(4, dto.getCategoryID());
                stm.setString(5, "PENDING");
                stm.setBoolean(6, dto.isHasAttachment());
                stm.setString(7, dto.getTags());
                stm.setInt(8, dto.getStudentID());

                int line = stm.executeUpdate();

                return line > 0;
            } // End connection
        } finally {

        }
        return false;
    }

    /**
     * Get block using blogID
     *
     * @param blogId ID of the blog
     * @return BlogDTO if found, null if not found
     * @throws SQLException
     */
    public static BlogDTO getBlogFromBlogID(int blogId) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            BlogDTO dto = null;

            con = DBHelpers.makeConnection();

            if (con != null) {
                String sql = "SELECT blogID, title, content,postDate, categoryID, status, approvedByID, approvedDate, hasAttachment, tags, ownerID "
                        + "FROM Blog "
                        + "WHERE blogID = ?";

                stm = con.prepareStatement(sql);
                stm.setInt(1, blogId);

                rs = stm.executeQuery();

                while (rs.next()) {
                    int blogID = rs.getInt("blogID");
                    String title = rs.getString("title");
                    String content = rs.getString("content");
                    Date postDate = rs.getDate("postDate");
                    String categoryID = rs.getString("categoryID");
                    String status = rs.getString("status");
                    int approvedByID = rs.getInt("approvedByID");
                    Date approvedDate = rs.getDate("approvedDate");
                    boolean hasAttachment = rs.getBoolean("hasAttachment");
                    String tags = rs.getString("tags");
                    int ownerID = rs.getInt("ownerID");

                    dto = new BlogDTO(blogID, title, content, postDate, categoryID, status, approvedByID, approvedDate, hasAttachment, tags, ownerID);
                }

                return dto;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    public static ArrayList<BlogDTO> getAllBlogFromAccountId(int accountId) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            ArrayList<BlogDTO> blogList = new ArrayList<BlogDTO>();

            con = DBHelpers.makeConnection();

            if (con != null) {
                String sql = "SELECT blogID, title, content, postDate, categoryID, status, approvedByID, approvedDate, hasAttachment, tags, ownerID "
                        + "FROM Blog "
                        + "WHERE ownerID = ?";

                stm = con.prepareStatement(sql);
                stm.setInt(1, accountId);
                rs = stm.executeQuery();

                while (rs.next()) {
                    int blogID = rs.getInt("blogID");
                    String title = rs.getString("title");
                    String content = rs.getString("content");
                    Date postDate = rs.getDate("postDate");
                    String categoryID = rs.getString("categoryID");
                    String status = rs.getString("status");
                    int approvedByID = rs.getInt("approvedByID");
                    Date approvedDate = rs.getDate("approvedDate");
                    boolean hasAttachment = rs.getBoolean("hasAttachment");
                    String tags = rs.getString("tags");
                    int ownerID = rs.getInt("ownerID");

                    BlogDTO dto = new BlogDTO(blogID, title, content, postDate, categoryID, status, approvedByID, approvedDate, hasAttachment, tags, ownerID);
                    blogList.add(dto);
                }

                return blogList;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    public static ArrayList<BlogDTO> getAllBlogFromCategoryId(int categoryId) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            ArrayList<BlogDTO> blogList = new ArrayList<BlogDTO>();

            con = DBHelpers.makeConnection();

            if (con != null) {
                String sql = "SELECT blogID, title, content, postDate, categoryID, status, approvedByID, approvedDate, hasAttachment, tags, ownerID "
                        + "FROM Blog "
                        + "WHERE categoryID = ?";

                stm = con.prepareStatement(sql);
                stm.setInt(1, categoryId);
                rs = stm.executeQuery();

                while (rs.next()) {
                    int blogID = rs.getInt("blogID");
                    String title = rs.getString("title");
                    String content = rs.getString("content");
                    Date postDate = rs.getDate("postDate");
                    String categoryID = rs.getString("categoryID");
                    String status = rs.getString("status");
                    int approvedByID = rs.getInt("approvedByID");
                    Date approvedDate = rs.getDate("approvedDate");
                    boolean hasAttachment = rs.getBoolean("hasAttachment");
                    String tags = rs.getString("tags");
                    int ownerID = rs.getInt("ownerID");

                    BlogDTO dto = new BlogDTO(blogID, title, content, postDate, categoryID, status, approvedByID, approvedDate, hasAttachment, tags, ownerID);
                    blogList.add(dto);
                }

                return blogList;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    /**
     * Get all blog in the database
     *
     * @return ArrayList<BlogDTO> if found, NULL if not found
     * @throws SQLException
     */
    public static ArrayList<BlogDTO> getAllBlogs() throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            ArrayList<BlogDTO> blogList = new ArrayList<BlogDTO>();

            con = DBHelpers.makeConnection();

            if (con != null) {
                String sql = "SELECT blogID, title, content, postDate, categoryID, status, approvedByID, approvedDate, hasAttachment, tags, ownerID "
                        + "FROM Blog";

                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();

                while (rs.next()) {
                    int blogID = rs.getInt("blogID");
                    String title = rs.getString("title");
                    String content = rs.getString("content");
                    Date postDate = rs.getDate("postDate");
                    String categoryID = rs.getString("categoryID");
                    String status = rs.getString("status");
                    int approvedByID = rs.getInt("approvedByID");
                    Date approvedDate = rs.getDate("approvedDate");
                    boolean hasAttachment = rs.getBoolean("hasAttachment");
                    String tags = rs.getString("tags");
                    int ownerID = rs.getInt("ownerID");

                    BlogDTO dto = new BlogDTO(blogID, title, content, postDate, categoryID, status, approvedByID, approvedDate, hasAttachment, tags, ownerID);
                    blogList.add(dto);
                }

                return blogList;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    public static boolean updateBlog(int blogId, BlogDTO dto) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;

        try {
            // 1. Connect DB
            con = DBHelpers.makeConnection();
            // 2. Create SQL String
            if (con != null) {
                String sql = "UPDATE Blog "
                        + "SET title = ?, content = ?, postDate = ?, categoryID = ?, status = ?, approvedByID = ?, approvedDate = ?, hasAttachment = ?, tags = ?, ownerID = ?  "
                        + "WHERE blogID = ?";
                // 3. Create statement object
                stm = con.prepareStatement(sql);

                stm.setString(1, dto.getTitle());
                stm.setString(2, dto.getContent());
                stm.setDate(3, dto.getPostDate());
                stm.setString(4, dto.getCategoryID());
                stm.setString(5, dto.getStatus());
                stm.setInt(6, dto.getMentorID());
                stm.setDate(7, dto.getApprovedDate());
                stm.setBoolean(8, dto.isHasAttachment());
                stm.setString(9, dto.getTags());
                stm.setInt(10, dto.getStudentID());

                stm.setInt(11, blogId);
                int line = stm.executeUpdate();

                return line > 0;
            } // End connection
        } finally {

        }
        return false;
    }

    public static boolean deleteBlog(int blogId) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;

        try {
            // 1. Connect DB
            con = DBHelpers.makeConnection();
            // 2. Create SQL String
            if (con != null) {
                String sql = "DELETE FROM Blog "
                        + "WHERE blogID = ?";
                // 3. Create statement object
                stm = con.prepareStatement(sql);
                stm.setInt(1, blogId);
                int line = stm.executeUpdate();

                return line > 0;
            } // End connection
        } finally {

        }
        return false;
    }

}