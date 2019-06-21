package com.tencent.tmassistantsdk.channel;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Environment;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;

public class DBOption
{
  protected static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists channeldata( itemId INTEGER PRIMARY KEY AUTOINCREMENT, itemData BLOB);";
  protected static final int DATEBASE_VERSION = 1;
  protected static final String DB_NAME = ".SystemConfig.db";
  protected static final String QUERY_ALL_SQL = "select * from channeldata";
  protected static final String TABLE_NAME = "channeldata";
  protected String DB_PATH;

  public DBOption()
  {
    AppMethodBeat.i(75607);
    this.DB_PATH = "";
    if (("mounted".equals(Environment.getExternalStorageState())) && (Environment.getExternalStorageDirectory().canWrite()));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        File localFile = Environment.getExternalStorageDirectory();
        this.DB_PATH = (localFile.getPath() + "/tencent/assistant/");
        localFile = new File(this.DB_PATH);
        if (!localFile.exists())
          localFile.mkdirs();
        this.DB_PATH += ".SystemConfig.db";
      }
      AppMethodBeat.o(75607);
      return;
    }
  }

  private void checkAndCreateTable(SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(75614);
    int i = paramSQLiteDatabase.getVersion();
    if (i != 1)
    {
      paramSQLiteDatabase.beginTransaction();
      if (i != 0);
    }
    while (true)
    {
      try
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE if not exists channeldata( itemId INTEGER PRIMARY KEY AUTOINCREMENT, itemData BLOB);");
        paramSQLiteDatabase.setVersion(1);
        paramSQLiteDatabase.setTransactionSuccessful();
        return;
      }
      finally
      {
        paramSQLiteDatabase.endTransaction();
        AppMethodBeat.o(75614);
      }
      AppMethodBeat.o(75614);
    }
  }

  private void closeDB(SQLiteDatabase paramSQLiteDatabase)
  {
    AppMethodBeat.i(75613);
    if ((paramSQLiteDatabase != null) && (paramSQLiteDatabase.isOpen()));
    while (true)
    {
      try
      {
        paramSQLiteDatabase.close();
        AppMethodBeat.o(75613);
        return;
      }
      catch (Exception paramSQLiteDatabase)
      {
      }
      AppMethodBeat.o(75613);
    }
  }

  // ERROR //
  private SQLiteDatabase getReadableDatabase()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: monitorenter
    //   6: ldc 127
    //   8: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: new 56	java/io/File
    //   14: astore_3
    //   15: aload_3
    //   16: aload_0
    //   17: getfield 36	com/tencent/tmassistantsdk/channel/DBOption:DB_PATH	Ljava/lang/String;
    //   20: invokespecial 78	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: aload_3
    //   24: invokevirtual 81	java/io/File:exists	()Z
    //   27: ifne +12 -> 39
    //   30: ldc 127
    //   32: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_2
    //   38: areturn
    //   39: iconst_0
    //   40: istore 4
    //   42: aload_1
    //   43: astore_2
    //   44: iload 4
    //   46: bipush 20
    //   48: if_icmpge +33 -> 81
    //   51: aload_0
    //   52: getfield 36	com/tencent/tmassistantsdk/channel/DBOption:DB_PATH	Ljava/lang/String;
    //   55: aconst_null
    //   56: iconst_1
    //   57: invokestatic 131	android/database/sqlite/SQLiteDatabase:openDatabase	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    //   60: astore_2
    //   61: aload_2
    //   62: astore_1
    //   63: aload_1
    //   64: astore_2
    //   65: aload_1
    //   66: ifnonnull +15 -> 81
    //   69: ldc2_w 132
    //   72: invokestatic 139	android/os/SystemClock:sleep	(J)V
    //   75: iinc 4 1
    //   78: goto -36 -> 42
    //   81: ldc 127
    //   83: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: goto -51 -> 35
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_1
    //   93: athrow
    //   94: astore_2
    //   95: goto -32 -> 63
    //
    // Exception table:
    //   from	to	target	type
    //   6	35	89	finally
    //   51	61	89	finally
    //   69	75	89	finally
    //   81	86	89	finally
    //   51	61	94	android/database/sqlite/SQLiteException
  }

  private SQLiteDatabase getWritableDatabase()
  {
    Object localObject1 = null;
    AppMethodBeat.i(75611);
    int i = 0;
    while (true)
    {
      Object localObject2 = localObject1;
      if (i < 20);
      try
      {
        localObject2 = SQLiteDatabase.openOrCreateDatabase(this.DB_PATH, null);
        localObject1 = localObject2;
        label28: if (localObject1 == null)
        {
          SystemClock.sleep(50L);
          i++;
          continue;
        }
        checkAndCreateTable(localObject1);
        localObject2 = localObject1;
        AppMethodBeat.o(75611);
        return localObject2;
      }
      catch (SQLiteException localSQLiteException)
      {
        break label28;
      }
    }
  }

  public boolean delete(long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(75609);
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    if (localSQLiteDatabase != null)
    {
      localSQLiteDatabase.delete("channeldata", "itemId=?", new String[] { String.valueOf(paramLong) });
      closeDB(localSQLiteDatabase);
      AppMethodBeat.o(75609);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(75609);
      bool = false;
    }
  }

  public long insert(TMAssistantSDKChannelDataItem paramTMAssistantSDKChannelDataItem)
  {
    long l = -1L;
    AppMethodBeat.i(75608);
    if (paramTMAssistantSDKChannelDataItem == null)
      AppMethodBeat.o(75608);
    while (true)
    {
      return l;
      byte[] arrayOfByte = paramTMAssistantSDKChannelDataItem.getBuffer();
      if (arrayOfByte != null)
      {
        paramTMAssistantSDKChannelDataItem = getWritableDatabase();
        if (paramTMAssistantSDKChannelDataItem != null)
        {
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("itemData", arrayOfByte);
          l = paramTMAssistantSDKChannelDataItem.insert("channeldata", "", localContentValues);
          closeDB(paramTMAssistantSDKChannelDataItem);
          AppMethodBeat.o(75608);
        }
      }
      else
      {
        AppMethodBeat.o(75608);
      }
    }
  }

  public ArrayList<TMAssistantSDKChannelDataItem> queryAll()
  {
    Object localObject = null;
    TMAssistantSDKChannelDataItem localTMAssistantSDKChannelDataItem = null;
    AppMethodBeat.i(75610);
    SQLiteDatabase localSQLiteDatabase = getReadableDatabase();
    if (localSQLiteDatabase != null)
    {
      Cursor localCursor = localSQLiteDatabase.rawQuery("select * from channeldata", null);
      localObject = localTMAssistantSDKChannelDataItem;
      if (localCursor != null)
      {
        localObject = localTMAssistantSDKChannelDataItem;
        if (localCursor.moveToFirst() == true)
        {
          int i = localCursor.getColumnIndex("itemId");
          int j = localCursor.getColumnIndex("itemData");
          localObject = new ArrayList();
          do
          {
            int k = localCursor.getInt(i);
            localTMAssistantSDKChannelDataItem = TMAssistantSDKChannelDataItem.getDataItemFromByte(localCursor.getBlob(j));
            if (localTMAssistantSDKChannelDataItem != null)
            {
              localTMAssistantSDKChannelDataItem.mDBIdentity = k;
              ((ArrayList)localObject).add(localTMAssistantSDKChannelDataItem);
            }
          }
          while (localCursor.moveToNext());
          closeDB(localSQLiteDatabase);
        }
      }
      localCursor.close();
      closeDB(localSQLiteDatabase);
      AppMethodBeat.o(75610);
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(75610);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.channel.DBOption
 * JD-Core Version:    0.6.2
 */