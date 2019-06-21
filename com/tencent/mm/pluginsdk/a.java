package com.tencent.mm.pluginsdk;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  public static Bitmap a(String paramString, Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(79194);
    if ((paramString == null) || (paramString.equals("")))
    {
      AppMethodBeat.o(79194);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramContext = paramContext.getContentResolver();
      try
      {
        long l = bo.anl(paramString);
        paramContext = ContactsContract.Contacts.openContactPhotoInputStream(paramContext, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, l), paramBoolean);
        if (paramContext == null)
        {
          AppMethodBeat.o(79194);
          paramString = null;
        }
        else
        {
          Bitmap localBitmap = d.decodeStream(paramContext);
          paramContext = localBitmap;
          if (localBitmap != null)
            paramContext = d.a(localBitmap, true, 4.0F);
          AppMethodBeat.o(79194);
          paramString = paramContext;
        }
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.AddressBookUtil", paramContext, "getAvatar, contactId:%s", new Object[] { paramString });
        AppMethodBeat.o(79194);
        paramString = null;
      }
    }
  }

  public static boolean aij(String paramString)
  {
    AppMethodBeat.i(79186);
    boolean bool;
    if (paramString.length() <= 0)
    {
      bool = false;
      AppMethodBeat.o(79186);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(79186);
    }
  }

  // ERROR //
  public static boolean b(String paramString, Context paramContext, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 85
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ifnull +12 -> 18
    //   9: aload_0
    //   10: ldc 17
    //   12: invokevirtual 23	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   15: ifeq +12 -> 27
    //   18: iconst_0
    //   19: istore_3
    //   20: ldc 85
    //   22: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: iload_3
    //   26: ireturn
    //   27: aload_1
    //   28: ldc 87
    //   30: invokestatic 92	com/tencent/mm/pluginsdk/permission/b:o	(Landroid/content/Context;Ljava/lang/String;)Z
    //   33: ifne +20 -> 53
    //   36: ldc 66
    //   38: ldc 94
    //   40: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: iconst_0
    //   44: istore_3
    //   45: ldc 85
    //   47: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   50: goto -25 -> 25
    //   53: aload_1
    //   54: invokevirtual 32	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   57: astore 4
    //   59: aload_0
    //   60: invokestatic 38	com/tencent/mm/sdk/platformtools/bo:anl	(Ljava/lang/String;)J
    //   63: lstore 5
    //   65: new 100	android/content/ContentValues
    //   68: astore 7
    //   70: aload 7
    //   72: invokespecial 104	android/content/ContentValues:<init>	()V
    //   75: ldc 106
    //   77: iconst_4
    //   78: anewarray 4	java/lang/Object
    //   81: dup
    //   82: iconst_0
    //   83: ldc 108
    //   85: aastore
    //   86: dup
    //   87: iconst_1
    //   88: lload 5
    //   90: invokestatic 114	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   93: aastore
    //   94: dup
    //   95: iconst_2
    //   96: ldc 116
    //   98: aastore
    //   99: dup
    //   100: iconst_3
    //   101: ldc 118
    //   103: aastore
    //   104: invokestatic 122	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   107: astore_0
    //   108: ldc 66
    //   110: ldc 124
    //   112: iconst_1
    //   113: anewarray 4	java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: aload_0
    //   119: aastore
    //   120: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: aload 4
    //   125: getstatic 131	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   128: aconst_null
    //   129: aload_0
    //   130: aconst_null
    //   131: aconst_null
    //   132: invokevirtual 137	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   135: astore_1
    //   136: aload_1
    //   137: ifnonnull +23 -> 160
    //   140: aload_1
    //   141: ifnull +9 -> 150
    //   144: aload_1
    //   145: invokeinterface 142 1 0
    //   150: iconst_0
    //   151: istore_3
    //   152: ldc 85
    //   154: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: goto -132 -> 25
    //   160: aload_1
    //   161: astore_0
    //   162: aload_1
    //   163: ldc 144
    //   165: invokeinterface 148 2 0
    //   170: istore 8
    //   172: aload_1
    //   173: astore_0
    //   174: aload_1
    //   175: invokeinterface 152 1 0
    //   180: ifeq +244 -> 424
    //   183: aload_1
    //   184: astore_0
    //   185: aload_1
    //   186: iload 8
    //   188: invokeinterface 156 2 0
    //   193: istore 8
    //   195: aload_1
    //   196: astore_0
    //   197: aload 7
    //   199: ldc 108
    //   201: lload 5
    //   203: invokestatic 114	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   206: invokevirtual 160	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   209: aload_1
    //   210: astore_0
    //   211: aload 7
    //   213: ldc 162
    //   215: iconst_1
    //   216: invokestatic 167	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   219: invokevirtual 170	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   222: aload_1
    //   223: astore_0
    //   224: aload 7
    //   226: ldc 172
    //   228: aload_2
    //   229: invokevirtual 175	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   232: aload_1
    //   233: astore_0
    //   234: aload 7
    //   236: ldc 116
    //   238: ldc 118
    //   240: invokevirtual 177	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   243: iload 8
    //   245: iflt +58 -> 303
    //   248: aload_1
    //   249: astore_0
    //   250: aload 4
    //   252: getstatic 131	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   255: aload 7
    //   257: ldc 179
    //   259: iload 8
    //   261: invokestatic 182	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   264: invokevirtual 186	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   267: aconst_null
    //   268: invokevirtual 190	android/content/ContentResolver:update	(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   271: istore 8
    //   273: iload 8
    //   275: ifle +23 -> 298
    //   278: iconst_1
    //   279: istore_3
    //   280: aload_1
    //   281: ifnull +9 -> 290
    //   284: aload_1
    //   285: invokeinterface 142 1 0
    //   290: ldc 85
    //   292: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   295: goto -270 -> 25
    //   298: iconst_0
    //   299: istore_3
    //   300: goto -20 -> 280
    //   303: aload_1
    //   304: astore_0
    //   305: aload 4
    //   307: getstatic 131	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   310: aload 7
    //   312: invokevirtual 194	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   315: pop
    //   316: aload_1
    //   317: ifnull +9 -> 326
    //   320: aload_1
    //   321: invokeinterface 142 1 0
    //   326: iconst_1
    //   327: istore_3
    //   328: ldc 85
    //   330: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   333: goto -308 -> 25
    //   336: astore_2
    //   337: aconst_null
    //   338: astore_1
    //   339: aload_1
    //   340: astore_0
    //   341: ldc 66
    //   343: aload_2
    //   344: ldc 17
    //   346: iconst_0
    //   347: anewarray 4	java/lang/Object
    //   350: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   353: aload_1
    //   354: ifnull +22 -> 376
    //   357: aload_1
    //   358: astore_0
    //   359: aload_1
    //   360: invokeinterface 197 1 0
    //   365: ifne +11 -> 376
    //   368: aload_1
    //   369: astore_0
    //   370: aload_1
    //   371: invokeinterface 142 1 0
    //   376: aload_1
    //   377: ifnull +9 -> 386
    //   380: aload_1
    //   381: invokeinterface 142 1 0
    //   386: iconst_0
    //   387: istore_3
    //   388: ldc 85
    //   390: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   393: goto -368 -> 25
    //   396: astore_1
    //   397: aconst_null
    //   398: astore_0
    //   399: aload_0
    //   400: ifnull +9 -> 409
    //   403: aload_0
    //   404: invokeinterface 142 1 0
    //   409: ldc 85
    //   411: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   414: aload_1
    //   415: athrow
    //   416: astore_1
    //   417: goto -18 -> 399
    //   420: astore_2
    //   421: goto -82 -> 339
    //   424: iconst_m1
    //   425: istore 8
    //   427: goto -232 -> 195
    //
    // Exception table:
    //   from	to	target	type
    //   53	136	336	java/lang/Exception
    //   53	136	396	finally
    //   162	172	416	finally
    //   174	183	416	finally
    //   185	195	416	finally
    //   197	209	416	finally
    //   211	222	416	finally
    //   224	232	416	finally
    //   234	243	416	finally
    //   250	273	416	finally
    //   305	316	416	finally
    //   341	353	416	finally
    //   359	368	416	finally
    //   370	376	416	finally
    //   162	172	420	java/lang/Exception
    //   174	183	420	java/lang/Exception
    //   185	195	420	java/lang/Exception
    //   197	209	420	java/lang/Exception
    //   211	222	420	java/lang/Exception
    //   224	232	420	java/lang/Exception
    //   234	243	420	java/lang/Exception
    //   250	273	420	java/lang/Exception
    //   305	316	420	java/lang/Exception
  }

  public static List<String[]> cJ(Context paramContext)
  {
    AppMethodBeat.i(79190);
    LinkedList localLinkedList = new LinkedList();
    Object localObject2 = paramContext.getContentResolver();
    if (!b.o(paramContext, "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.AddressBookUtil", "no contact permission");
      AppMethodBeat.o(79190);
    }
    while (true)
    {
      return localLinkedList;
      try
      {
        paramContext = ((ContentResolver)localObject2).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, "sort_key_alt");
        if (paramContext == null)
        {
          ab.e("MicroMsg.AddressBookUtil", "getMobileInfo: mobile is null");
          AppMethodBeat.o(79190);
        }
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AddressBookUtil", paramContext, "", new Object[0]);
          ab.e("MicroMsg.AddressBookUtil", "exception in getMoblieOrderInfo(), [%s]", new Object[] { paramContext.getMessage() });
          paramContext = ((ContentResolver)localObject2).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        }
        try
        {
          if ((paramContext.getCount() > 0) && (paramContext.moveToFirst()))
          {
            boolean bool;
            do
            {
              localObject2 = paramContext.getString(paramContext.getColumnIndex("display_name"));
              localLinkedList.add(new String[] { paramContext.getString(paramContext.getColumnIndex("contact_id")), localObject2, paramContext.getString(paramContext.getColumnIndex("data1")), paramContext.getString(paramContext.getColumnIndex("raw_contact_id")) });
              bool = paramContext.moveToNext();
            }
            while (bool);
          }
          paramContext.close();
          AppMethodBeat.o(79190);
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.AddressBookUtil", localException, "", new Object[0]);
            ab.e("MicroMsg.AddressBookUtil", "exception in getMoblieOrderInfo()2, [%s]", new Object[] { localException.getMessage() });
            paramContext.close();
          }
        }
        finally
        {
          paramContext.close();
          AppMethodBeat.o(79190);
        }
      }
    }
  }

  public static Uri dgN()
  {
    try
    {
      Uri localUri = ContactsContract.Contacts.CONTENT_URI;
      return localUri;
    }
    catch (Exception localException)
    {
      while (true)
        Object localObject = null;
    }
  }

  // ERROR //
  public static String[] f(Context paramContext, Uri paramUri)
  {
    // Byte code:
    //   0: ldc 250
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnonnull +19 -> 25
    //   9: ldc 66
    //   11: ldc 252
    //   13: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: ldc 250
    //   18: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aconst_null
    //   22: astore_0
    //   23: aload_0
    //   24: areturn
    //   25: aload_0
    //   26: ldc 87
    //   28: iconst_0
    //   29: invokestatic 258	com/tencent/mm/pluginsdk/permission/b:j	(Landroid/content/Context;Ljava/lang/String;Z)Z
    //   32: ifne +20 -> 52
    //   35: ldc 66
    //   37: ldc 94
    //   39: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: ldc 250
    //   44: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: aconst_null
    //   48: astore_0
    //   49: goto -26 -> 23
    //   52: aload_0
    //   53: invokevirtual 32	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   56: aload_1
    //   57: aconst_null
    //   58: aconst_null
    //   59: aconst_null
    //   60: aconst_null
    //   61: invokevirtual 137	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   64: astore_1
    //   65: aload_1
    //   66: ifnull +680 -> 746
    //   69: aload_1
    //   70: invokeinterface 221 1 0
    //   75: ifle +671 -> 746
    //   78: aload_1
    //   79: invokeinterface 152 1 0
    //   84: pop
    //   85: aload_1
    //   86: ldc_w 260
    //   89: invokeinterface 226 2 0
    //   94: istore_2
    //   95: iload_2
    //   96: ifle +13 -> 109
    //   99: aload_1
    //   100: iload_2
    //   101: invokeinterface 156 2 0
    //   106: ifle +640 -> 746
    //   109: aload_1
    //   110: aload_1
    //   111: ldc 144
    //   113: invokeinterface 226 2 0
    //   118: invokeinterface 229 2 0
    //   123: astore_3
    //   124: aload_0
    //   125: invokevirtual 32	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   128: getstatic 206	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   131: aconst_null
    //   132: ldc_w 262
    //   135: aload_3
    //   136: invokestatic 265	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   139: invokevirtual 186	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   142: aconst_null
    //   143: aconst_null
    //   144: invokevirtual 137	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   147: astore 4
    //   149: aload 4
    //   151: ifnull +306 -> 457
    //   154: aload 4
    //   156: invokeinterface 152 1 0
    //   161: istore 5
    //   163: iload 5
    //   165: ifeq +292 -> 457
    //   168: aconst_null
    //   169: astore 6
    //   171: aconst_null
    //   172: astore_0
    //   173: aload 6
    //   175: astore 7
    //   177: aload_0
    //   178: astore_3
    //   179: aload 6
    //   181: astore 8
    //   183: aload_0
    //   184: astore 9
    //   186: aload 4
    //   188: invokeinterface 268 1 0
    //   193: ifne +269 -> 462
    //   196: aload 6
    //   198: astore 8
    //   200: aload_0
    //   201: astore 9
    //   203: aload 4
    //   205: ldc 233
    //   207: invokeinterface 226 2 0
    //   212: istore 10
    //   214: aload 6
    //   216: astore 8
    //   218: aload_0
    //   219: astore 9
    //   221: aload 4
    //   223: ldc 223
    //   225: invokeinterface 226 2 0
    //   230: istore_2
    //   231: aload 6
    //   233: astore 8
    //   235: aload_0
    //   236: astore 9
    //   238: aload 4
    //   240: iload 10
    //   242: invokeinterface 229 2 0
    //   247: astore 11
    //   249: aload 6
    //   251: astore 8
    //   253: aload_0
    //   254: astore 9
    //   256: aload 4
    //   258: iload_2
    //   259: invokeinterface 229 2 0
    //   264: astore 12
    //   266: aload_0
    //   267: astore_3
    //   268: ldc 66
    //   270: ldc_w 270
    //   273: aload 12
    //   275: invokestatic 265	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   278: invokevirtual 186	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   281: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   284: aload_0
    //   285: astore 7
    //   287: aload 11
    //   289: ifnull +83 -> 372
    //   292: aload_0
    //   293: astore_3
    //   294: ldc 66
    //   296: ldc_w 272
    //   299: aload 11
    //   301: invokestatic 265	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   304: invokevirtual 186	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   307: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   310: aload 11
    //   312: ifnonnull +101 -> 413
    //   315: aconst_null
    //   316: astore 6
    //   318: aload_0
    //   319: astore_3
    //   320: ldc 66
    //   322: ldc_w 272
    //   325: aload 6
    //   327: invokestatic 265	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   330: invokevirtual 186	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   333: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   336: aload_0
    //   337: astore 7
    //   339: aload_0
    //   340: astore_3
    //   341: aload 6
    //   343: invokestatic 277	android/telephony/PhoneNumberUtils:isGlobalPhoneNumber	(Ljava/lang/String;)Z
    //   346: ifeq +7 -> 353
    //   349: aload 6
    //   351: astore 7
    //   353: aload 7
    //   355: astore_3
    //   356: ldc 66
    //   358: ldc_w 279
    //   361: aload 7
    //   363: invokestatic 265	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   366: invokevirtual 186	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   369: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   372: aload 7
    //   374: astore_3
    //   375: aload 4
    //   377: invokeinterface 241 1 0
    //   382: pop
    //   383: aload 12
    //   385: astore 6
    //   387: aload 7
    //   389: astore_0
    //   390: goto -217 -> 173
    //   393: astore_0
    //   394: ldc 66
    //   396: aload_0
    //   397: ldc_w 281
    //   400: iconst_0
    //   401: anewarray 4	java/lang/Object
    //   404: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   407: aconst_null
    //   408: astore 4
    //   410: goto -261 -> 149
    //   413: aload_0
    //   414: astore_3
    //   415: aload 11
    //   417: ldc_w 283
    //   420: ldc 17
    //   422: invokevirtual 287	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   425: astore 7
    //   427: aload 7
    //   429: astore 6
    //   431: aload_0
    //   432: astore_3
    //   433: aload 7
    //   435: ldc_w 289
    //   438: invokevirtual 292	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   441: ifeq -123 -> 318
    //   444: aload_0
    //   445: astore_3
    //   446: aload 7
    //   448: iconst_2
    //   449: invokevirtual 295	java/lang/String:substring	(I)Ljava/lang/String;
    //   452: astore 6
    //   454: goto -136 -> 318
    //   457: aconst_null
    //   458: astore 7
    //   460: aconst_null
    //   461: astore_3
    //   462: aload 7
    //   464: astore_0
    //   465: aload_3
    //   466: astore 6
    //   468: aload 4
    //   470: ifnull +46 -> 516
    //   473: aload 7
    //   475: astore_0
    //   476: aload_3
    //   477: astore 6
    //   479: aload 7
    //   481: astore 8
    //   483: aload_3
    //   484: astore 9
    //   486: aload 4
    //   488: invokeinterface 197 1 0
    //   493: ifne +23 -> 516
    //   496: aload 7
    //   498: astore 8
    //   500: aload_3
    //   501: astore 9
    //   503: aload 4
    //   505: invokeinterface 142 1 0
    //   510: aload_3
    //   511: astore 6
    //   513: aload 7
    //   515: astore_0
    //   516: aload_0
    //   517: astore 9
    //   519: aload 6
    //   521: astore 7
    //   523: aload_1
    //   524: ifnull +32 -> 556
    //   527: aload_0
    //   528: astore 9
    //   530: aload 6
    //   532: astore 7
    //   534: aload_1
    //   535: invokeinterface 197 1 0
    //   540: ifne +16 -> 556
    //   543: aload_1
    //   544: invokeinterface 142 1 0
    //   549: aload 6
    //   551: astore 7
    //   553: aload_0
    //   554: astore 9
    //   556: aload 9
    //   558: invokestatic 301	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   561: ifeq +112 -> 673
    //   564: aload 7
    //   566: invokestatic 301	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   569: ifeq +104 -> 673
    //   572: ldc 250
    //   574: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   577: aconst_null
    //   578: astore_0
    //   579: goto -556 -> 23
    //   582: astore 6
    //   584: aconst_null
    //   585: astore_3
    //   586: aconst_null
    //   587: astore_0
    //   588: aconst_null
    //   589: astore_1
    //   590: ldc 66
    //   592: aload 6
    //   594: ldc_w 303
    //   597: iconst_0
    //   598: anewarray 4	java/lang/Object
    //   601: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   604: aload_0
    //   605: astore 9
    //   607: aload_1
    //   608: astore 7
    //   610: aload_3
    //   611: ifnull -55 -> 556
    //   614: aload_0
    //   615: astore 9
    //   617: aload_1
    //   618: astore 7
    //   620: aload_3
    //   621: invokeinterface 197 1 0
    //   626: ifne -70 -> 556
    //   629: aload_3
    //   630: invokeinterface 142 1 0
    //   635: aload_0
    //   636: astore 9
    //   638: aload_1
    //   639: astore 7
    //   641: goto -85 -> 556
    //   644: astore_0
    //   645: aconst_null
    //   646: astore_1
    //   647: aload_1
    //   648: ifnull +18 -> 666
    //   651: aload_1
    //   652: invokeinterface 197 1 0
    //   657: ifne +9 -> 666
    //   660: aload_1
    //   661: invokeinterface 142 1 0
    //   666: ldc 250
    //   668: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   671: aload_0
    //   672: athrow
    //   673: ldc 250
    //   675: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   678: iconst_2
    //   679: anewarray 19	java/lang/String
    //   682: dup
    //   683: iconst_0
    //   684: aload 9
    //   686: aastore
    //   687: dup
    //   688: iconst_1
    //   689: aload 7
    //   691: aastore
    //   692: astore_0
    //   693: goto -670 -> 23
    //   696: astore_0
    //   697: goto -50 -> 647
    //   700: astore_0
    //   701: aload_3
    //   702: astore_1
    //   703: goto -56 -> 647
    //   706: astore 6
    //   708: aload_1
    //   709: astore_3
    //   710: aconst_null
    //   711: astore_0
    //   712: aconst_null
    //   713: astore_1
    //   714: goto -124 -> 590
    //   717: astore 6
    //   719: aload_1
    //   720: astore 7
    //   722: aload 12
    //   724: astore_0
    //   725: aload_3
    //   726: astore_1
    //   727: aload 7
    //   729: astore_3
    //   730: goto -140 -> 590
    //   733: astore 6
    //   735: aload_1
    //   736: astore_3
    //   737: aload 8
    //   739: astore_0
    //   740: aload 9
    //   742: astore_1
    //   743: goto -153 -> 590
    //   746: aconst_null
    //   747: astore_0
    //   748: aconst_null
    //   749: astore 6
    //   751: goto -235 -> 516
    //
    // Exception table:
    //   from	to	target	type
    //   124	149	393	java/lang/Exception
    //   52	65	582	java/lang/Exception
    //   52	65	644	finally
    //   69	95	696	finally
    //   99	109	696	finally
    //   109	124	696	finally
    //   124	149	696	finally
    //   154	163	696	finally
    //   186	196	696	finally
    //   203	214	696	finally
    //   221	231	696	finally
    //   238	249	696	finally
    //   256	266	696	finally
    //   268	284	696	finally
    //   294	310	696	finally
    //   320	336	696	finally
    //   341	349	696	finally
    //   356	372	696	finally
    //   375	383	696	finally
    //   394	407	696	finally
    //   415	427	696	finally
    //   433	444	696	finally
    //   446	454	696	finally
    //   486	496	696	finally
    //   503	510	696	finally
    //   590	604	700	finally
    //   69	95	706	java/lang/Exception
    //   99	109	706	java/lang/Exception
    //   109	124	706	java/lang/Exception
    //   154	163	706	java/lang/Exception
    //   394	407	706	java/lang/Exception
    //   268	284	717	java/lang/Exception
    //   294	310	717	java/lang/Exception
    //   320	336	717	java/lang/Exception
    //   341	349	717	java/lang/Exception
    //   356	372	717	java/lang/Exception
    //   375	383	717	java/lang/Exception
    //   415	427	717	java/lang/Exception
    //   433	444	717	java/lang/Exception
    //   446	454	717	java/lang/Exception
    //   186	196	733	java/lang/Exception
    //   203	214	733	java/lang/Exception
    //   221	231	733	java/lang/Exception
    //   238	249	733	java/lang/Exception
    //   256	266	733	java/lang/Exception
    //   486	496	733	java/lang/Exception
    //   503	510	733	java/lang/Exception
  }

  public static List<String[]> fA(Context paramContext)
  {
    AppMethodBeat.i(79191);
    LinkedList localLinkedList = new LinkedList();
    Object localObject = paramContext.getContentResolver();
    if (!b.o(paramContext, "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.AddressBookUtil", "no contact permission");
      AppMethodBeat.o(79191);
    }
    while (true)
    {
      return localLinkedList;
      try
      {
        paramContext = ((ContentResolver)localObject).query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, null, null, null);
        if (paramContext == null)
        {
          AppMethodBeat.o(79191);
          continue;
        }
        if (paramContext.moveToFirst())
          do
          {
            localObject = paramContext.getString(paramContext.getColumnIndex("data1"));
            localLinkedList.add(new String[] { paramContext.getString(paramContext.getColumnIndex("contact_id")), paramContext.getString(paramContext.getColumnIndex("data4")), localObject, paramContext.getString(paramContext.getColumnIndex("raw_contact_id")), paramContext.getString(paramContext.getColumnIndex("photo_id")) });
          }
          while (paramContext.moveToNext());
        paramContext.close();
        AppMethodBeat.o(79191);
      }
      catch (Exception paramContext)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AddressBookUtil", paramContext, "getEmailInfo", new Object[0]);
      }
    }
  }

  // ERROR //
  public static List<String> fB(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 316
    //   3: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 202	java/util/LinkedList
    //   9: dup
    //   10: invokespecial 203	java/util/LinkedList:<init>	()V
    //   13: astore_1
    //   14: aload_0
    //   15: invokevirtual 32	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   18: astore_2
    //   19: aload_0
    //   20: ldc 87
    //   22: invokestatic 92	com/tencent/mm/pluginsdk/permission/b:o	(Landroid/content/Context;Ljava/lang/String;)Z
    //   25: ifne +18 -> 43
    //   28: ldc 66
    //   30: ldc 94
    //   32: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: ldc_w 316
    //   38: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: aload_1
    //   42: areturn
    //   43: aload_2
    //   44: getstatic 206	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   47: aconst_null
    //   48: aconst_null
    //   49: aconst_null
    //   50: aconst_null
    //   51: invokevirtual 137	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore_2
    //   55: aload_2
    //   56: ifnonnull +32 -> 88
    //   59: aload_2
    //   60: astore_0
    //   61: ldc 66
    //   63: ldc_w 318
    //   66: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   69: aload_2
    //   70: ifnull +9 -> 79
    //   73: aload_2
    //   74: invokeinterface 142 1 0
    //   79: ldc_w 316
    //   82: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: goto -44 -> 41
    //   88: aload_2
    //   89: astore_0
    //   90: aload_2
    //   91: invokeinterface 152 1 0
    //   96: ifeq +39 -> 135
    //   99: aload_2
    //   100: astore_0
    //   101: aload_1
    //   102: aload_2
    //   103: aload_2
    //   104: ldc 233
    //   106: invokeinterface 226 2 0
    //   111: invokeinterface 229 2 0
    //   116: invokeinterface 238 2 0
    //   121: pop
    //   122: aload_2
    //   123: astore_0
    //   124: aload_2
    //   125: invokeinterface 241 1 0
    //   130: istore_3
    //   131: iload_3
    //   132: ifne -33 -> 99
    //   135: aload_2
    //   136: ifnull +9 -> 145
    //   139: aload_2
    //   140: invokeinterface 142 1 0
    //   145: ldc_w 316
    //   148: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   151: goto -110 -> 41
    //   154: astore 4
    //   156: aconst_null
    //   157: astore_2
    //   158: aload_2
    //   159: astore_0
    //   160: ldc 66
    //   162: ldc_w 320
    //   165: iconst_1
    //   166: anewarray 4	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload 4
    //   173: invokevirtual 216	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   176: aastore
    //   177: invokestatic 218	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   180: aload_2
    //   181: astore_0
    //   182: ldc 66
    //   184: aload 4
    //   186: ldc 17
    //   188: iconst_0
    //   189: anewarray 4	java/lang/Object
    //   192: invokestatic 74	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   195: aload_2
    //   196: ifnull -51 -> 145
    //   199: aload_2
    //   200: invokeinterface 142 1 0
    //   205: goto -60 -> 145
    //   208: astore_2
    //   209: aconst_null
    //   210: astore_0
    //   211: aload_0
    //   212: ifnull +9 -> 221
    //   215: aload_0
    //   216: invokeinterface 142 1 0
    //   221: ldc_w 316
    //   224: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   227: aload_2
    //   228: athrow
    //   229: astore_2
    //   230: goto -19 -> 211
    //   233: astore 4
    //   235: goto -77 -> 158
    //
    // Exception table:
    //   from	to	target	type
    //   43	55	154	java/lang/Exception
    //   43	55	208	finally
    //   61	69	229	finally
    //   90	99	229	finally
    //   101	122	229	finally
    //   124	131	229	finally
    //   160	180	229	finally
    //   182	195	229	finally
    //   61	69	233	java/lang/Exception
    //   90	99	233	java/lang/Exception
    //   101	122	233	java/lang/Exception
    //   124	131	233	java/lang/Exception
  }

  public static List<String[]> fz(Context paramContext)
  {
    AppMethodBeat.i(79189);
    LinkedList localLinkedList = new LinkedList();
    Object localObject2 = paramContext.getContentResolver();
    if (!b.o(paramContext, "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.AddressBookUtil", "no contact permission");
      AppMethodBeat.o(79189);
    }
    while (true)
    {
      return localLinkedList;
      try
      {
        paramContext = ((ContentResolver)localObject2).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        if (paramContext == null)
        {
          ab.e("MicroMsg.AddressBookUtil", "getMobileInfo: mobile is null");
          AppMethodBeat.o(79189);
        }
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.e("MicroMsg.AddressBookUtil", "getMobileInfo: exception occured [%s]", new Object[] { paramContext.getMessage() });
          ab.printErrStackTrace("MicroMsg.AddressBookUtil", paramContext, "", new Object[0]);
          paramContext = null;
        }
        try
        {
          if ((paramContext.getCount() > 0) && (paramContext.moveToFirst()))
          {
            boolean bool;
            do
            {
              localObject2 = paramContext.getString(paramContext.getColumnIndex("display_name"));
              localLinkedList.add(new String[] { paramContext.getString(paramContext.getColumnIndex("contact_id")), localObject2, paramContext.getString(paramContext.getColumnIndex("data1")), paramContext.getString(paramContext.getColumnIndex("raw_contact_id")), String.valueOf(Long.valueOf(paramContext.getLong(paramContext.getColumnIndex("photo_id")))) });
              bool = paramContext.moveToNext();
            }
            while (bool);
          }
          paramContext.close();
          AppMethodBeat.o(79189);
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.AddressBookUtil", "getMobileInfo: exception2 occured [%s]", new Object[] { localException.getMessage() });
            ab.printErrStackTrace("MicroMsg.AddressBookUtil", localException, "", new Object[0]);
            paramContext.close();
          }
        }
        finally
        {
          paramContext.close();
          AppMethodBeat.o(79189);
        }
      }
    }
  }

  public static String i(String paramString, Context paramContext)
  {
    AppMethodBeat.i(79193);
    String str = "";
    if (!b.o(paramContext, "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.AddressBookUtil", "no contact permission");
      AppMethodBeat.o(79193);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      try
      {
        paramContext = paramContext.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[] { "display_name" }, "_id = ?", new String[] { paramString }, null);
        if (paramContext == null)
        {
          AppMethodBeat.o(79193);
          paramString = str;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AddressBookUtil", paramString, "getContactNameById:", new Object[0]);
          paramContext = null;
        }
      }
    }
    if (paramContext.moveToFirst());
    for (paramString = paramContext.getString(0); ; paramString = "")
    {
      paramContext.close();
      AppMethodBeat.o(79193);
      break;
    }
  }

  public static String ws(String paramString)
  {
    AppMethodBeat.i(79187);
    String str = paramString.trim();
    boolean bool = str.startsWith("+");
    paramString = str;
    if (bool)
    {
      paramString = str;
      if (str.length() > 1)
        paramString = str.substring(1, str.length());
    }
    paramString = Pattern.compile("[^0-9]").matcher(paramString);
    if (bool);
    for (paramString = "+" + paramString.replaceAll("").trim(); ; paramString = paramString.replaceAll("").trim())
    {
      AppMethodBeat.o(79187);
      return paramString;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.a
 * JD-Core Version:    0.6.2
 */