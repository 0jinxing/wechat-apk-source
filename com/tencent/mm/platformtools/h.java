package com.tencent.mm.platformtools;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Looper;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class h
  implements Runnable
{
  private String cEr;
  private Account ggY;
  private h.a ggZ;
  private Looper gha;
  private Context mContext;
  private String username;

  public h(Context paramContext, Account paramAccount)
  {
    this(paramContext, paramAccount, null, null);
  }

  public h(Context paramContext, Account paramAccount, String paramString)
  {
    this(paramContext, paramAccount, paramString, null);
  }

  public h(Context paramContext, Account paramAccount, String paramString1, String paramString2)
  {
    AppMethodBeat.i(124521);
    this.mContext = paramContext;
    this.ggY = paramAccount;
    this.username = paramString1;
    this.cEr = paramString2;
    ab.i("MicroMsg.ContactsOperations", "username = " + paramString1 + ", " + paramString2);
    AppMethodBeat.o(124521);
  }

  // ERROR //
  private void anG()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 77
    //   4: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 83	com/tencent/mm/kernel/g:RK	()Z
    //   10: ifne +22 -> 32
    //   13: ldc 46
    //   15: ldc 85
    //   17: invokestatic 88	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: aload_0
    //   21: invokespecial 91	com/tencent/mm/platformtools/h:quit	()V
    //   24: ldc 77
    //   26: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: ldc 93
    //   34: invokestatic 97	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   37: checkcast 93	com/tencent/mm/plugin/account/a/a/a
    //   40: invokeinterface 101 1 0
    //   45: checkcast 103	com/tencent/mm/plugin/account/friend/a/b
    //   48: astore_1
    //   49: new 48	java/lang/StringBuilder
    //   52: astore_2
    //   53: aload_2
    //   54: ldc 105
    //   56: invokespecial 53	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   59: aload_1
    //   60: aload_2
    //   61: ldc 107
    //   63: invokestatic 113	com/tencent/mm/sdk/platformtools/bo:vA	(Ljava/lang/String;)Ljava/lang/String;
    //   66: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: ldc 115
    //   71: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: invokevirtual 119	com/tencent/mm/plugin/account/friend/a/b:vX	(Ljava/lang/String;)Ljava/util/List;
    //   80: astore_3
    //   81: aload_3
    //   82: invokeinterface 125 1 0
    //   87: ifne +27 -> 114
    //   90: ldc 46
    //   92: ldc 127
    //   94: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   97: aload_0
    //   98: invokespecial 91	com/tencent/mm/platformtools/h:quit	()V
    //   101: ldc 77
    //   103: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: goto -77 -> 29
    //   109: astore_1
    //   110: aload_0
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    //   114: new 132	java/util/HashMap
    //   117: astore 4
    //   119: aload 4
    //   121: invokespecial 133	java/util/HashMap:<init>	()V
    //   124: getstatic 139	android/provider/ContactsContract$RawContacts:CONTENT_URI	Landroid/net/Uri;
    //   127: invokevirtual 145	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   130: ldc 147
    //   132: aload_0
    //   133: getfield 40	com/tencent/mm/platformtools/h:ggY	Landroid/accounts/Account;
    //   136: getfield 152	android/accounts/Account:name	Ljava/lang/String;
    //   139: invokevirtual 158	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   142: ldc 160
    //   144: aload_0
    //   145: getfield 40	com/tencent/mm/platformtools/h:ggY	Landroid/accounts/Account;
    //   148: getfield 163	android/accounts/Account:type	Ljava/lang/String;
    //   151: invokevirtual 158	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   154: invokevirtual 167	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   157: astore_1
    //   158: aload_0
    //   159: getfield 38	com/tencent/mm/platformtools/h:mContext	Landroid/content/Context;
    //   162: ldc 169
    //   164: invokestatic 174	com/tencent/mm/pluginsdk/permission/b:o	(Landroid/content/Context;Ljava/lang/String;)Z
    //   167: ifne +18 -> 185
    //   170: ldc 46
    //   172: ldc 176
    //   174: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   177: ldc 77
    //   179: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: goto -153 -> 29
    //   185: aload_0
    //   186: getfield 38	com/tencent/mm/platformtools/h:mContext	Landroid/content/Context;
    //   189: invokevirtual 182	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   192: aload_1
    //   193: iconst_2
    //   194: anewarray 184	java/lang/String
    //   197: dup
    //   198: iconst_0
    //   199: ldc 186
    //   201: aastore
    //   202: dup
    //   203: iconst_1
    //   204: ldc 188
    //   206: aastore
    //   207: ldc 190
    //   209: aconst_null
    //   210: aconst_null
    //   211: invokevirtual 196	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   214: astore_1
    //   215: aload_1
    //   216: ifnonnull +217 -> 433
    //   219: ldc 46
    //   221: ldc 198
    //   223: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   226: aload_1
    //   227: astore_2
    //   228: aload_2
    //   229: ifnull +9 -> 238
    //   232: aload_2
    //   233: invokeinterface 203 1 0
    //   238: aload_0
    //   239: ldc 205
    //   241: invokespecial 209	com/tencent/mm/platformtools/h:vr	(Ljava/lang/String;)Z
    //   244: ifne +268 -> 512
    //   247: aload_0
    //   248: ldc 211
    //   250: invokespecial 209	com/tencent/mm/platformtools/h:vr	(Ljava/lang/String;)Z
    //   253: ifne +259 -> 512
    //   256: iconst_1
    //   257: istore 5
    //   259: new 8	com/tencent/mm/platformtools/h$a
    //   262: astore_1
    //   263: aload_1
    //   264: aload_0
    //   265: aload_0
    //   266: getfield 38	com/tencent/mm/platformtools/h:mContext	Landroid/content/Context;
    //   269: invokevirtual 182	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   272: invokespecial 214	com/tencent/mm/platformtools/h$a:<init>	(Lcom/tencent/mm/platformtools/h;Landroid/content/ContentResolver;)V
    //   275: aload_0
    //   276: aload_1
    //   277: putfield 216	com/tencent/mm/platformtools/h:ggZ	Lcom/tencent/mm/platformtools/h$a;
    //   280: aload_3
    //   281: invokeinterface 220 1 0
    //   286: astore_3
    //   287: aload_3
    //   288: invokeinterface 225 1 0
    //   293: ifeq +246 -> 539
    //   296: aload_3
    //   297: invokeinterface 229 1 0
    //   302: checkcast 231	com/tencent/mm/plugin/account/friend/a/a
    //   305: astore 6
    //   307: aload 6
    //   309: invokevirtual 234	com/tencent/mm/plugin/account/friend/a/a:getUsername	()Ljava/lang/String;
    //   312: astore_2
    //   313: ldc 236
    //   315: invokestatic 240	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   318: checkcast 236	com/tencent/mm/plugin/messenger/foundation/a/j
    //   321: invokeinterface 244 1 0
    //   326: aload_2
    //   327: invokeinterface 250 2 0
    //   332: astore_1
    //   333: aload_1
    //   334: ifnull +193 -> 527
    //   337: aload_1
    //   338: getfield 256	com/tencent/mm/g/c/ap:field_type	I
    //   341: invokestatic 262	com/tencent/mm/n/a:jh	(I)Z
    //   344: ifeq +183 -> 527
    //   347: aload 6
    //   349: invokevirtual 265	com/tencent/mm/plugin/account/friend/a/a:apA	()Ljava/lang/String;
    //   352: invokestatic 268	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   355: ifeq +163 -> 518
    //   358: aload 6
    //   360: invokevirtual 271	com/tencent/mm/plugin/account/friend/a/a:apD	()Ljava/lang/String;
    //   363: astore_1
    //   364: aload 6
    //   366: invokevirtual 274	com/tencent/mm/plugin/account/friend/a/a:apG	()Ljava/lang/String;
    //   369: astore 7
    //   371: aload 6
    //   373: getfield 277	com/tencent/mm/plugin/account/friend/a/a:guM	Ljava/lang/String;
    //   376: astore 6
    //   378: aload 4
    //   380: aload 6
    //   382: invokeinterface 283 2 0
    //   387: ifnull +8 -> 395
    //   390: iload 5
    //   392: ifeq +31 -> 423
    //   395: aload 4
    //   397: aload 6
    //   399: invokeinterface 283 2 0
    //   404: ifnull +9 -> 413
    //   407: aload_0
    //   408: aload 6
    //   410: invokespecial 286	com/tencent/mm/platformtools/h:vq	(Ljava/lang/String;)V
    //   413: aload_0
    //   414: aload_1
    //   415: aload 7
    //   417: aload 6
    //   419: aload_2
    //   420: invokespecial 289	com/tencent/mm/platformtools/h:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   423: aload_0
    //   424: getfield 216	com/tencent/mm/platformtools/h:ggZ	Lcom/tencent/mm/platformtools/h$a;
    //   427: invokevirtual 292	com/tencent/mm/platformtools/h$a:execute	()V
    //   430: goto -143 -> 287
    //   433: aload_1
    //   434: astore_2
    //   435: aload_1
    //   436: invokeinterface 295 1 0
    //   441: ifeq -213 -> 228
    //   444: aload 4
    //   446: aload_1
    //   447: iconst_0
    //   448: invokeinterface 299 2 0
    //   453: aload_1
    //   454: iconst_1
    //   455: invokeinterface 303 2 0
    //   460: invokestatic 309	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   463: invokeinterface 313 3 0
    //   468: pop
    //   469: aload_1
    //   470: invokeinterface 316 1 0
    //   475: istore 8
    //   477: iload 8
    //   479: ifne -35 -> 444
    //   482: aload_1
    //   483: astore_2
    //   484: goto -256 -> 228
    //   487: astore_2
    //   488: aconst_null
    //   489: astore_1
    //   490: ldc 46
    //   492: aload_2
    //   493: ldc 107
    //   495: iconst_1
    //   496: anewarray 4	java/lang/Object
    //   499: dup
    //   500: iconst_0
    //   501: ldc 107
    //   503: aastore
    //   504: invokestatic 320	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   507: aload_1
    //   508: astore_2
    //   509: goto -281 -> 228
    //   512: iconst_0
    //   513: istore 5
    //   515: goto -256 -> 259
    //   518: aload 6
    //   520: invokevirtual 265	com/tencent/mm/plugin/account/friend/a/a:apA	()Ljava/lang/String;
    //   523: astore_1
    //   524: goto -160 -> 364
    //   527: aload_0
    //   528: aload 6
    //   530: getfield 277	com/tencent/mm/plugin/account/friend/a/a:guM	Ljava/lang/String;
    //   533: invokespecial 286	com/tencent/mm/platformtools/h:vq	(Ljava/lang/String;)V
    //   536: goto -249 -> 287
    //   539: aload_0
    //   540: getfield 216	com/tencent/mm/platformtools/h:ggZ	Lcom/tencent/mm/platformtools/h$a;
    //   543: invokevirtual 292	com/tencent/mm/platformtools/h$a:execute	()V
    //   546: aload_0
    //   547: invokespecial 91	com/tencent/mm/platformtools/h:quit	()V
    //   550: ldc 77
    //   552: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   555: goto -526 -> 29
    //   558: astore_2
    //   559: goto -69 -> 490
    //
    // Exception table:
    //   from	to	target	type
    //   2	29	109	finally
    //   32	106	109	finally
    //   114	182	109	finally
    //   185	215	109	finally
    //   219	226	109	finally
    //   232	238	109	finally
    //   238	256	109	finally
    //   259	287	109	finally
    //   287	333	109	finally
    //   337	364	109	finally
    //   364	390	109	finally
    //   395	413	109	finally
    //   413	423	109	finally
    //   423	430	109	finally
    //   435	444	109	finally
    //   444	477	109	finally
    //   490	507	109	finally
    //   518	524	109	finally
    //   527	536	109	finally
    //   539	555	109	finally
    //   185	215	487	java/lang/Exception
    //   219	226	558	java/lang/Exception
    //   435	444	558	java/lang/Exception
    //   444	477	558	java/lang/Exception
  }

  private void e(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(124525);
    ab.d("MicroMsg.ContactsOperations", "add wechat contact: displayname:" + paramString1 + ", phoneNum:" + paramString2 + ", " + paramString3 + ", username:" + paramString4);
    paramString4 = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
    paramString4.withValue("account_name", this.ggY.name);
    paramString4.withValue("account_type", this.ggY.type);
    paramString4.withValue("sync1", paramString3);
    this.ggZ.a(paramString4.build());
    paramString4 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
    paramString4.withValueBackReference("raw_contact_id", 0);
    paramString4.withValue("mimetype", "vnd.android.cursor.item/name");
    paramString4.withValue("data1", paramString1);
    this.ggZ.a(paramString4.build());
    paramString1 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
    paramString1.withValueBackReference("raw_contact_id", 0);
    paramString1.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile");
    paramString1.withValue("data1", paramString2);
    paramString1.withValue("data2", this.mContext.getString(2131296982));
    paramString1.withValue("data3", this.mContext.getString(2131298768));
    paramString1.withValue("data4", paramString3);
    this.ggZ.a(paramString1.build());
    if ("1".equals(com.tencent.mm.m.g.Nu().getValue("VOIPCallType")))
    {
      paramString1 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      paramString1.withValueBackReference("raw_contact_id", 0);
      paramString1.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video");
      paramString1.withValue("data1", paramString2);
      paramString1.withValue("data2", this.mContext.getString(2131296982));
      paramString1.withValue("data3", this.mContext.getString(2131298770));
      paramString1.withValue("data4", paramString3);
      this.ggZ.a(paramString1.build());
    }
    while (true)
    {
      paramString1 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      paramString1.withValueBackReference("raw_contact_id", 0);
      paramString1.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline");
      paramString1.withValue("data1", paramString2);
      paramString1.withValue("data2", this.mContext.getString(2131296982));
      paramString1.withValue("data3", this.mContext.getString(2131298771));
      paramString1.withValue("data4", paramString3);
      this.ggZ.a(paramString1.build());
      paramString1 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      paramString1.withValueBackReference("raw_contact_id", 0);
      paramString1.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voiceaction");
      paramString1.withValue("data1", paramString2);
      paramString1.withValue("data2", this.mContext.getString(2131296982));
      paramString1.withValue("data3", "");
      paramString1.withValue("data4", paramString3);
      this.ggZ.a(paramString1.build());
      AppMethodBeat.o(124525);
      return;
      paramString1 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      paramString1.withValueBackReference("raw_contact_id", 0);
      paramString1.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip");
      paramString1.withValue("data1", paramString2);
      paramString1.withValue("data2", this.mContext.getString(2131296982));
      paramString1.withValue("data3", this.mContext.getString(2131298769));
      paramString1.withValue("data4", paramString3);
      this.ggZ.a(paramString1.build());
    }
  }

  private void quit()
  {
    AppMethodBeat.i(124523);
    if (this.gha != null)
      this.gha.quit();
    AppMethodBeat.o(124523);
  }

  private void vq(String paramString)
  {
    AppMethodBeat.i(124526);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ContactsOperations", "delete wechat contact fail, phoneNum5 is null");
      AppMethodBeat.o(124526);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.pluginsdk.permission.b.o(this.mContext, "android.permission.READ_CONTACTS"))
      {
        ab.e("MicroMsg.ContactsOperations", "no contact permission");
        AppMethodBeat.o(124526);
        continue;
      }
      try
      {
        paramString = this.mContext.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "contact_id", "_id" }, "(mimetype= ? or mimetype= ? or mimetype= ? or mimetype= ? or mimetype= ?) AND data4 = ?", new String[] { "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile", "vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voiceaction", paramString }, null);
        if (paramString == null)
        {
          ab.e("MicroMsg.ContactsOperations", "get null cursor");
          AppMethodBeat.o(124526);
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.ContactsOperations", "query fail, match error %s \n %s", new Object[] { paramString.getMessage(), bo.l(paramString) });
          paramString = null;
        }
      }
      try
      {
        label188: int i;
        String str1;
        if (paramString.moveToFirst())
        {
          i = paramString.getColumnIndex("contact_id");
          if (i < 0)
            break label332;
          str1 = paramString.getString(i);
          label210: i = paramString.getColumnIndex("_id");
          if (i < 0)
            break label338;
        }
        label332: label338: for (String str2 = paramString.getString(i); ; str2 = "")
        {
          if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)))
          {
            this.mContext.getContentResolver().delete(ContactsContract.Data.CONTENT_URI, "_id = ?", new String[] { str2 });
            this.mContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI, "contact_id = ? AND account_type = ?", new String[] { str1, "com.tencent.mm.account" });
          }
          boolean bool = paramString.moveToNext();
          if (bool)
            break label188;
          paramString.close();
          AppMethodBeat.o(124526);
          break;
          str1 = "";
          break label210;
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.ContactsOperations", "delete wechat contact failed : " + localException.getMessage());
      }
    }
  }

  private boolean vr(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(124527);
    if (!com.tencent.mm.pluginsdk.permission.b.o(this.mContext, "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.ContactsOperations", "no contact permission");
      AppMethodBeat.o(124527);
    }
    while (true)
    {
      return bool;
      try
      {
        localCursor = this.mContext.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "contact_id" }, "mimetype= ?", new String[] { paramString }, null);
        if (localCursor == null);
      }
      catch (Exception paramString)
      {
        while (true)
        {
          try
          {
            Cursor localCursor;
            if (localCursor.getCount() > 0)
            {
              ab.d("MicroMsg.ContactsOperations", "has minetype:".concat(String.valueOf(paramString)));
              bool = true;
              if (localCursor != null)
                localCursor.close();
              AppMethodBeat.o(124527);
              break;
              paramString = paramString;
              localCursor = null;
              ab.e("MicroMsg.ContactsOperations", "hasMIMEType search failed : " + paramString.getMessage());
              bool = true;
              continue;
            }
          }
          catch (Exception paramString)
          {
            continue;
          }
          bool = false;
        }
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(124522);
    Looper.prepare();
    this.gha = Looper.myLooper();
    ab.i("MicroMsg.ContactsOperations", "start time:".concat(String.valueOf(System.currentTimeMillis())));
    if (!com.tencent.mm.kernel.g.RN().QY())
    {
      ab.w("MicroMsg.ContactsOperations", "account not ready, quit this operation");
      quit();
      AppMethodBeat.o(124522);
      return;
    }
    if ((bo.isNullOrNil(this.username)) && (bo.isNullOrNil(this.cEr)))
      anG();
    while (true)
    {
      ab.i("MicroMsg.ContactsOperations", "end time:" + System.currentTimeMillis());
      Looper.loop();
      AppMethodBeat.o(124522);
      break;
      if (!bo.isNullOrNil(this.cEr))
        break label183;
      locala = ((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).vT(this.username);
      if ((locala != null) && (!bo.isNullOrNil(locala.guM)))
        vq(locala.guM);
      quit();
    }
    label183: com.tencent.mm.plugin.account.friend.a.a locala = ((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).vT(this.username);
    if ((locala == null) || (bo.isNullOrNil(locala.guM)))
      locala = ((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).vT(this.cEr);
    while (true)
    {
      while (true)
        if ((locala != null) && (!bo.isNullOrNil(locala.guM)))
          try
          {
            if (!com.tencent.mm.pluginsdk.permission.b.o(this.mContext, "android.permission.READ_CONTACTS"))
              ab.e("MicroMsg.ContactsOperations", "no contact permission");
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.ContactsOperations", localException, "", new Object[] { "" });
          }
      while (true)
      {
        quit();
        break;
        Object localObject1 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", this.ggY.name).appendQueryParameter("account_type", this.ggY.type).build();
        Object localObject2 = this.mContext.getContentResolver();
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("deleted=\"0\" AND sync1=\"");
        localObject3 = localException.guM + "\"";
        localObject2 = ((ContentResolver)localObject2).query((Uri)localObject1, new String[] { "sync1", "_id" }, (String)localObject3, null, null);
        if ((localObject2 == null) || (((Cursor)localObject2).getCount() == 0))
          if (!bo.isNullOrNil(localException.apA()))
            break label494;
        label494: for (localObject1 = localException.apD(); ; localObject1 = localException.apA())
        {
          localObject3 = new com/tencent/mm/platformtools/h$a;
          ((h.a)localObject3).<init>(this, this.mContext.getContentResolver());
          this.ggZ = ((h.a)localObject3);
          e((String)localObject1, localException.apG(), localException.guM, this.username);
          this.ggZ.execute();
          if (localObject2 == null)
            break;
          ((Cursor)localObject2).close();
          break;
        }
        ab.d("MicroMsg.ContactsOperations", "query addrupload is null " + this.username);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.h
 * JD-Core Version:    0.6.2
 */