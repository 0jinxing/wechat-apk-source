package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bm;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends n
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS addr_upload2 ( id int  PRIMARY KEY , md5 text  , peopleid text  , uploadtime long  , realname text  , realnamepyinitial text  , realnamequanpin text  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , type int  , moblie text  , email text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int , lvbuf BLOG , showhead int  ) ", "CREATE INDEX IF NOT EXISTS upload_time_index ON addr_upload2 ( uploadtime ) ", "CREATE INDEX IF NOT EXISTS addr_upload_user_index ON addr_upload2 ( username ) " };
  public final h fni;

  public b(h paramh)
  {
    AppMethodBeat.i(108309);
    this.fni = paramh;
    Cursor localCursor = paramh.a("PRAGMA table_info( " + "addr_upload2" + " )", null, 2);
    int i = localCursor.getColumnIndex("name");
    int j = 0;
    int k = 0;
    while (localCursor.moveToNext())
      if (i >= 0)
      {
        String str = localCursor.getString(i);
        if ("lvbuf".equalsIgnoreCase(str))
          k = 1;
        else if ("showhead".equalsIgnoreCase(str))
          j = 1;
      }
    localCursor.close();
    if (k == 0)
      paramh.hY("addr_upload2", "Alter table " + "addr_upload2" + " add lvbuf BLOB ");
    if (j == 0)
      paramh.hY("addr_upload2", "Alter table " + "addr_upload2" + " add showhead int ");
    AppMethodBeat.o(108309);
  }

  public final int a(String paramString, a parama)
  {
    int i = 0;
    AppMethodBeat.i(108313);
    ContentValues localContentValues = parama.Hl();
    if (localContentValues.size() > 0)
      i = this.fni.update("addr_upload2", localContentValues, "id=?", new String[] { a.vR(paramString) });
    if (i > 0)
    {
      if (parama.Aq().equals(paramString))
        break label98;
      b(5, this, paramString);
      b(2, this, parama.Aq());
    }
    while (true)
    {
      AppMethodBeat.o(108313);
      return i;
      label98: b(3, this, paramString);
    }
  }

  public final boolean aa(List<a> paramList)
  {
    AppMethodBeat.i(108311);
    boolean bool;
    if ((paramList == null) || (paramList.size() <= 0))
    {
      bool = false;
      AppMethodBeat.o(108311);
      return bool;
    }
    bm localbm = new bm("MicroMsg.AddrUploadStorage", "transaction");
    localbm.addSplit("transation begin");
    long l = this.fni.iV(Thread.currentThread().getId());
    int i = 0;
    while (true)
    {
      a locala;
      try
      {
        if (i >= paramList.size())
          break label447;
        locala = (a)paramList.get(i);
        if (locala != null)
        {
          localObject = locala.Aq();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where addr_upload2.id = \"");
          localObject = a.vR((String)localObject) + "\"";
          localObject = this.fni.a((String)localObject, null, 2);
          if (localObject == null)
          {
            bool = false;
            if (bool)
              break label306;
            locala.bJt = -1;
            localObject = locala.Hl();
            if ((int)this.fni.insert("addr_upload2", "id", (ContentValues)localObject) != -1)
              continue;
            ab.i("MicroMsg.AddrUploadStorage", "batchSet insert failed, num:%s email:%s", new Object[] { locala.apG(), locala.getEmail() });
            bool = true;
            this.fni.mB(l);
            localbm.addSplit("transation end");
            localbm.dumpToLog();
            AppMethodBeat.o(108311);
            break;
          }
          bool = ((Cursor)localObject).moveToFirst();
          ((Cursor)localObject).close();
          continue;
        }
      }
      catch (Exception paramList)
      {
        ab.e("MicroMsg.AddrUploadStorage", paramList.getMessage());
        bool = false;
        continue;
        b(2, this, locala.Aq());
        i++;
      }
      continue;
      label306: int j = a.vR(locala.Aq());
      Object localObject = locala.Hl();
      int k = 0;
      if (((ContentValues)localObject).size() > 0)
        k = this.fni.update("addr_upload2", (ContentValues)localObject, "id=?", new String[] { String.valueOf(j) });
      if (k == 0)
      {
        ab.i("MicroMsg.AddrUploadStorage", "batchSet update result=0, num:%s email:%s", new Object[] { locala.apG(), locala.getEmail() });
      }
      else if (k < 0)
      {
        ab.i("MicroMsg.AddrUploadStorage", "batchSet update failed, num:%s email:%s", new Object[] { locala.apG(), locala.getEmail() });
        bool = true;
      }
      else
      {
        b(3, this, locala.Aq());
        continue;
        label447: bool = true;
      }
    }
  }

  public final boolean ap(List<String> paramList)
  {
    AppMethodBeat.i(108310);
    boolean bool;
    if (paramList.size() <= 0)
    {
      bool = false;
      AppMethodBeat.o(108310);
      return bool;
    }
    bm localbm = new bm("MicroMsg.AddrUploadStorage", "delete transaction");
    localbm.addSplit("begin");
    long l = this.fni.iV(Thread.currentThread().getId());
    try
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (String)localIterator.next();
        if ((paramList != null) && (paramList.length() > 0))
        {
          Object localObject = this.fni;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          int i = ((h)localObject).delete("addr_upload2", "id =?", new String[] { a.vR(paramList) });
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("delete addr_upload2 md5 :");
          ab.d("MicroMsg.AddrUploadStorage", paramList + ", res:" + i);
          if (i > 0)
            b(5, this, paramList);
        }
      }
    }
    catch (Exception paramList)
    {
      ab.printErrStackTrace("MicroMsg.AddrUploadStorage", paramList, "", new Object[0]);
      bool = false;
    }
    while (true)
    {
      this.fni.mB(l);
      localbm.addSplit("end");
      localbm.dumpToLog();
      AppMethodBeat.o(108310);
      break;
      bool = true;
    }
  }

  public final List<String[]> apJ()
  {
    AppMethodBeat.i(108318);
    Cursor localCursor = this.fni.a("select addr_upload2.moblie , addr_upload2.md5 from addr_upload2 where addr_upload2.type = 0", null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
      localArrayList.add(new String[] { localCursor.getString(0), localCursor.getString(1) });
    localCursor.close();
    AppMethodBeat.o(108318);
    return localArrayList;
  }

  public final boolean apK()
  {
    boolean bool = true;
    AppMethodBeat.i(108320);
    Object localObject;
    if ((this.fni == null) || (this.fni.dpU()))
      if (this.fni == null)
      {
        localObject = "null";
        ab.w("MicroMsg.AddrUploadStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        AppMethodBeat.o(108320);
        bool = false;
      }
    while (true)
    {
      return bool;
      localObject = Boolean.valueOf(this.fni.dpU());
      break;
      AppMethodBeat.o(108320);
    }
  }

  public final boolean aq(List<String> paramList)
  {
    AppMethodBeat.i(108312);
    bm localbm = new bm("MicroMsg.AddrUploadStorage", "set uploaded transaction");
    localbm.addSplit("transation begin");
    long l = this.fni.iV(Thread.currentThread().getId());
    boolean bool;
    try
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (String)localIterator.next();
        if ((paramList != null) && (paramList.length() > 0))
        {
          Object localObject = new com/tencent/mm/plugin/account/friend/a/a;
          ((a)localObject).<init>();
          ((a)localObject).bJt = 8;
          ((a)localObject).guD = bo.anT();
          localObject = ((a)localObject).Hl();
          int i = 0;
          if (((ContentValues)localObject).size() > 0)
          {
            h localh = this.fni;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            i = localh.update("addr_upload2", (ContentValues)localObject, "id=?", new String[] { a.vR(paramList) });
          }
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("local contact uploaded : ");
          ab.i("MicroMsg.AddrUploadStorage", paramList + ", update result: " + i);
        }
      }
    }
    catch (Exception paramList)
    {
      ab.e("MicroMsg.AddrUploadStorage", paramList.getMessage());
      bool = false;
    }
    while (true)
    {
      this.fni.mB(l);
      localbm.addSplit("transation end");
      localbm.dumpToLog();
      if (bool)
        b(3, this, null);
      AppMethodBeat.o(108312);
      return bool;
      bool = true;
    }
  }

  public final a vT(String paramString)
  {
    a locala = null;
    AppMethodBeat.i(108314);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(108314);
    for (paramString = locala; ; paramString = locala)
    {
      return paramString;
      locala = new a();
      Object localObject = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 where addr_upload2.username=\"" + bo.vA(paramString) + "\"";
      localObject = this.fni.a((String)localObject, null, 2);
      ab.d("MicroMsg.AddrUploadStorage", "get addrUpload :".concat(String.valueOf(paramString)));
      if (((Cursor)localObject).moveToFirst())
        locala.d((Cursor)localObject);
      ((Cursor)localObject).close();
      AppMethodBeat.o(108314);
    }
  }

  public final Cursor vU(String paramString)
  {
    AppMethodBeat.i(108315);
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramString != null) && (paramString.length() > 0))
    {
      localStringBuilder.append(" and ( ");
      localStringBuilder.append("addr_upload2.realname like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.realnamepyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.realnamequanpin like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.username like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.nickname like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamepyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamequanpin like '%" + paramString + "%' )");
    }
    localStringBuilder.append(" and (");
    localStringBuilder.append("addr_upload2.status=1");
    localStringBuilder.append(" or ");
    localStringBuilder.append("addr_upload2.status=2");
    localStringBuilder.append(")");
    paramString = (String)g.RP().Ry().get(6, null);
    if ((paramString != null) && (!paramString.equals("")))
    {
      paramString = this.fni.a("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0 and moblie <> " + paramString + localStringBuilder.toString() + " order by  case when status = 1 then 0  when status = 65536 then 1  when status = 2 then 2 else 3 end  , realnamepyinitial", null, 0);
      AppMethodBeat.o(108315);
    }
    while (true)
    {
      return paramString;
      paramString = this.fni.a("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0" + localStringBuilder.toString() + " order by  case when status = 1 then 0  when status = 65536 then 1  when status = 2 then 2 else 3 end  , realnamepyinitial", null, 0);
      AppMethodBeat.o(108315);
    }
  }

  public final Cursor vV(String paramString)
  {
    AppMethodBeat.i(108316);
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramString != null) && (paramString.length() > 0))
    {
      localStringBuilder.append(" and ( ");
      localStringBuilder.append("addr_upload2.realname like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.realnamepyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.realnamequanpin like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.username like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.nickname like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamepyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamequanpin like '%" + paramString + "%' )");
    }
    localStringBuilder.append(" and (");
    localStringBuilder.append("addr_upload2.status=1");
    localStringBuilder.append(" or ");
    localStringBuilder.append("addr_upload2.status=2");
    localStringBuilder.append(")");
    paramString = (String)g.RP().Ry().get(6, null);
    if ((paramString != null) && (!paramString.equals("")))
    {
      paramString = this.fni.a("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0 and moblie <> " + paramString + localStringBuilder.toString() + " order by showhead", null, 0);
      AppMethodBeat.o(108316);
    }
    while (true)
    {
      return paramString;
      paramString = this.fni.a("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0" + localStringBuilder.toString() + " order by showhead", null, 0);
      AppMethodBeat.o(108316);
    }
  }

  public final a vW(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(108317);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(108317);
      localObject1 = localObject2;
      return localObject1;
    }
    localObject2 = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 where addr_upload2.id=\"" + a.vR(paramString) + "\"";
    localObject2 = this.fni.a((String)localObject2, null, 2);
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new a();
      ((a)localObject1).d((Cursor)localObject2);
    }
    paramString = new StringBuilder("get addrUpload :").append(paramString).append(", resCnt:");
    if (localObject1 != null);
    for (int i = 1; ; i = 0)
    {
      ab.d("MicroMsg.AddrUploadStorage", i);
      ((Cursor)localObject2).close();
      AppMethodBeat.o(108317);
      break;
    }
  }

  public final List<a> vX(String paramString)
  {
    AppMethodBeat.i(108319);
    ab.d("MicroMsg.AddrUploadStorage", "sql : ".concat(String.valueOf(paramString)));
    ArrayList localArrayList = new ArrayList();
    ab.d("MicroMsg.AddrUploadStorage", "sql : ".concat(String.valueOf(paramString)));
    Cursor localCursor = this.fni.a(paramString, null, 2);
    while (localCursor.moveToNext())
    {
      paramString = new a();
      paramString.d(localCursor);
      localArrayList.add(paramString);
    }
    localCursor.close();
    AppMethodBeat.o(108319);
    return localArrayList;
  }

  public final String vY(String paramString)
  {
    AppMethodBeat.i(108321);
    paramString = vW(paramString);
    if (paramString != null)
    {
      paramString = paramString.getUsername();
      AppMethodBeat.o(108321);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(108321);
    }
  }

  // ERROR //
  public final String vZ(String paramString)
  {
    // Byte code:
    //   0: ldc_w 430
    //   3: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 332	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   10: ifne +96 -> 106
    //   13: aload_0
    //   14: getfield 34	com/tencent/mm/plugin/account/friend/a/b:fni	Lcom/tencent/mm/cd/h;
    //   17: ldc 43
    //   19: aconst_null
    //   20: ldc_w 432
    //   23: iconst_1
    //   24: anewarray 12	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: aload_1
    //   30: aastore
    //   31: aconst_null
    //   32: aconst_null
    //   33: aconst_null
    //   34: iconst_2
    //   35: invokevirtual 435	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   38: astore_2
    //   39: aload_2
    //   40: astore_1
    //   41: aload_2
    //   42: invokeinterface 218 1 0
    //   47: ifeq +49 -> 96
    //   50: aload_2
    //   51: astore_1
    //   52: new 103	com/tencent/mm/plugin/account/friend/a/a
    //   55: astore_3
    //   56: aload_2
    //   57: astore_1
    //   58: aload_3
    //   59: invokespecial 311	com/tencent/mm/plugin/account/friend/a/a:<init>	()V
    //   62: aload_2
    //   63: astore_1
    //   64: aload_3
    //   65: aload_2
    //   66: invokevirtual 349	com/tencent/mm/plugin/account/friend/a/a:d	(Landroid/database/Cursor;)V
    //   69: aload_2
    //   70: astore_1
    //   71: aload_3
    //   72: invokevirtual 428	com/tencent/mm/plugin/account/friend/a/a:getUsername	()Ljava/lang/String;
    //   75: astore_3
    //   76: aload_3
    //   77: astore_1
    //   78: aload_2
    //   79: ifnull +9 -> 88
    //   82: aload_2
    //   83: invokeinterface 86 1 0
    //   88: ldc_w 430
    //   91: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_1
    //   95: areturn
    //   96: aload_2
    //   97: ifnull +9 -> 106
    //   100: aload_2
    //   101: invokeinterface 86 1 0
    //   106: ldc_w 430
    //   109: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: aconst_null
    //   113: astore_1
    //   114: goto -20 -> 94
    //   117: astore_3
    //   118: aconst_null
    //   119: astore_2
    //   120: aload_2
    //   121: astore_1
    //   122: ldc 149
    //   124: ldc_w 437
    //   127: iconst_1
    //   128: anewarray 195	java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: aload_3
    //   134: invokevirtual 221	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   137: aastore
    //   138: invokestatic 439	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: aload_2
    //   142: ifnull -36 -> 106
    //   145: aload_2
    //   146: invokeinterface 86 1 0
    //   151: goto -45 -> 106
    //   154: astore_2
    //   155: aconst_null
    //   156: astore_1
    //   157: aload_1
    //   158: ifnull +9 -> 167
    //   161: aload_1
    //   162: invokeinterface 86 1 0
    //   167: ldc_w 430
    //   170: invokestatic 99	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: aload_2
    //   174: athrow
    //   175: astore_2
    //   176: goto -19 -> 157
    //   179: astore_3
    //   180: goto -60 -> 120
    //
    // Exception table:
    //   from	to	target	type
    //   13	39	117	java/lang/Exception
    //   13	39	154	finally
    //   41	50	175	finally
    //   52	56	175	finally
    //   58	62	175	finally
    //   64	69	175	finally
    //   71	76	175	finally
    //   122	141	175	finally
    //   41	50	179	java/lang/Exception
    //   52	56	179	java/lang/Exception
    //   58	62	179	java/lang/Exception
    //   64	69	179	java/lang/Exception
    //   71	76	179	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.b
 * JD-Core Version:    0.6.2
 */