package com.demo.roomdemo.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfBookEntity;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfBookEntity;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfBookEntity;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBookEntity = new EntityInsertionAdapter<BookEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `books`(`id`,`title`,`pages`,`editorial`,`author`,`description`,`photourl`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPages() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPages());
        }
        if (value.getEditorial() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEditorial());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAuthor());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        if (value.getPhotourl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPhotourl());
        }
      }
    };
    this.__deletionAdapterOfBookEntity = new EntityDeletionOrUpdateAdapter<BookEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `books` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfBookEntity = new EntityDeletionOrUpdateAdapter<BookEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `books` SET `id` = ?,`title` = ?,`pages` = ?,`editorial` = ?,`author` = ?,`description` = ?,`photourl` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BookEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPages() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPages());
        }
        if (value.getEditorial() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEditorial());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAuthor());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        if (value.getPhotourl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPhotourl());
        }
        stmt.bindLong(8, value.getId());
      }
    };
  }

  @Override
  public void insertUser(BookEntity book) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfBookEntity.insert(book);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUser(BookEntity book) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfBookEntity.handle(book);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUser(BookEntity book) {
    __db.beginTransaction();
    try {
      __updateAdapterOfBookEntity.handle(book);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<BookEntity> getAllUserInfo() {
    final String _sql = "SELECT * FROM books";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfPages = _cursor.getColumnIndexOrThrow("pages");
      final int _cursorIndexOfEditorial = _cursor.getColumnIndexOrThrow("editorial");
      final int _cursorIndexOfAuthor = _cursor.getColumnIndexOrThrow("author");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfPhotourl = _cursor.getColumnIndexOrThrow("photourl");
      final List<BookEntity> _result = new ArrayList<BookEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BookEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpPages;
        _tmpPages = _cursor.getString(_cursorIndexOfPages);
        final String _tmpEditorial;
        _tmpEditorial = _cursor.getString(_cursorIndexOfEditorial);
        final String _tmpAuthor;
        _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpPhotourl;
        _tmpPhotourl = _cursor.getString(_cursorIndexOfPhotourl);
        _item = new BookEntity(_tmpId,_tmpTitle,_tmpPages,_tmpEditorial,_tmpAuthor,_tmpDescription,_tmpPhotourl);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
