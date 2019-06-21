package com.tencent.mm.platformtools;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.Profile;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public final class i
{
  private static String H(Context paramContext, String paramString)
  {
    Object localObject = null;
    Cursor localCursor = null;
    AppMethodBeat.i(124529);
    ab.i("MicroMsg.ContactsUtil", "Get contactId by email, email = %s", new Object[] { paramString });
    if (paramContext == null)
    {
      ab.e("MicroMsg.ContactsUtil", "context is null.");
      AppMethodBeat.o(124529);
      paramContext = localCursor;
    }
    while (true)
    {
      return paramContext;
      if (bo.isNullOrNil(paramString))
      {
        ab.i("MicroMsg.ContactsUtil", "email is null.");
        AppMethodBeat.o(124529);
        paramContext = localCursor;
        continue;
      }
      try
      {
        localCursor = paramContext.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[] { "contact_id", "data1" }, "data1=?", new String[] { paramString }, null);
        if (localCursor != null)
        {
          bool = localCursor.moveToFirst();
          if (bool)
            paramString = localObject;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          try
          {
            paramContext = localCursor.getString(localCursor.getColumnIndex("contact_id"));
            paramString = paramContext;
            if (!bo.isNullOrNil(paramContext))
            {
              paramString = paramContext;
              ab.i("MicroMsg.ContactsUtil", "Have got contactId ,contactId is [%s]", new Object[] { paramContext });
            }
          }
          catch (Exception localException)
          {
            try
            {
              localCursor.close();
              AppMethodBeat.o(124529);
              break;
              paramString = paramContext;
              boolean bool = localCursor.moveToNext();
              paramString = paramContext;
              if (bool)
                continue;
              continue;
              paramString = paramString;
              paramContext = null;
              ab.printErrStackTrace("MicroMsg.ContactsUtil", paramString, "getContactIdByEmail error", new Object[0]);
              continue;
              localException = localException;
              paramContext = paramString;
              paramString = localException;
              continue;
            }
            catch (Exception paramString)
            {
              continue;
            }
          }
          paramContext = null;
          continue;
          paramContext = null;
        }
      }
    }
  }

  @TargetApi(14)
  public static String cj(Context paramContext)
  {
    Object localObject1 = null;
    AppMethodBeat.i(124530);
    ab.i("MicroMsg.ContactsUtil", "Get name of a contacts record or profile.");
    if (paramContext == null)
    {
      ab.e("MicroMsg.ContactsUtil", "context is null.");
      AppMethodBeat.o(124530);
    }
    ContentResolver localContentResolver;
    for (Object localObject2 = localObject1; ; localObject2 = localObject1)
    {
      return localObject2;
      localContentResolver = paramContext.getContentResolver();
      if (b.o(paramContext, "android.permission.READ_CONTACTS"))
        break;
      ab.e("MicroMsg.ContactsUtil", "no contact permission");
      AppMethodBeat.o(124530);
    }
    if (d.iW(14))
      ab.i("MicroMsg.ContactsUtil", "The Android API version is higher than 14.");
    while (true)
    {
      try
      {
        localObject2 = localContentResolver.query(ContactsContract.Profile.CONTENT_URI, new String[] { "display_name" }, null, null, null);
        if (localObject2 == null)
          break label321;
        if (!((Cursor)localObject2).moveToFirst())
          break label315;
        String str1 = ((Cursor)localObject2).getString(((Cursor)localObject2).getColumnIndex("display_name"));
        ab.i("MicroMsg.ContactsUtil", "Have got name from profile, name is %s", new Object[] { str1 });
        ((Cursor)localObject2).close();
        localObject2 = str1;
        if (bo.isNullOrNil(str1))
        {
          paramContext = H(paramContext, w.ct(paramContext));
          if (bo.isNullOrNil(paramContext))
          {
            ab.i("MicroMsg.ContactsUtil", "contactId is null.");
            AppMethodBeat.o(124530);
            localObject2 = localObject1;
          }
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.ContactsUtil", localException, "", new Object[0]);
        ab.d("MicroMsg.ContactsUtil", "query crashed");
        localObject2 = null;
        continue;
        paramContext = localContentResolver.query(ContactsContract.Data.CONTENT_URI, new String[] { "display_name" }, "contact_id=?", new String[] { paramContext }, null);
        localObject2 = localException;
        if (paramContext != null)
        {
          if (paramContext.moveToFirst())
          {
            str2 = paramContext.getString(paramContext.getColumnIndex("display_name"));
            ab.i("MicroMsg.ContactsUtil", "Have got name from contacts, name is %s", new Object[] { str2 });
          }
          paramContext.close();
          localObject2 = str2;
        }
        AppMethodBeat.o(124530);
      }
      break;
      label315: String str2 = null;
      continue;
      label321: str2 = null;
    }
  }

  @TargetApi(14)
  public static Bitmap ck(Context paramContext)
  {
    AppMethodBeat.i(124531);
    ab.i("MicroMsg.ContactsUtil", "Get bitmap of a contacts record or profile.");
    if (paramContext == null)
    {
      ab.e("MicroMsg.ContactsUtil", "context is null.");
      paramContext = null;
      AppMethodBeat.o(124531);
    }
    ContentResolver localContentResolver;
    Object localObject1;
    Object localObject2;
    Object localObject5;
    int i;
    label413: Object localObject4;
    while (true)
    {
      return paramContext;
      localContentResolver = paramContext.getContentResolver();
      localObject1 = null;
      if (!b.o(paramContext, "android.permission.READ_CONTACTS"))
      {
        ab.e("MicroMsg.ContactsUtil", "no contact permission");
        paramContext = null;
        AppMethodBeat.o(124531);
      }
      else
      {
        localObject2 = null;
        Object localObject3 = localObject1;
        if (d.iW(14))
        {
          ab.i("MicroMsg.ContactsUtil", "The Android API version is higher than 14.");
          try
          {
            localObject3 = localContentResolver.query(ContactsContract.Profile.CONTENT_URI, new String[] { "_id" }, null, null, null);
            localObject2 = localObject3;
            localObject3 = localObject1;
            if (localObject2 != null)
            {
              if (((Cursor)localObject2).getCount() <= 0)
                break label546;
              ((Cursor)localObject2).close();
            }
          }
          catch (Exception localException1)
          {
            try
            {
              localObject5 = localContentResolver.query(Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data"), new String[] { "data15", "data_sync1" }, "mimetype=?", new String[] { "vnd.android.cursor.item/photo" }, null);
              localObject3 = localObject1;
              if (localObject5 != null)
              {
                if (!((Cursor)localObject5).moveToFirst())
                  break label1001;
                if ((at.isWifi(paramContext)) || (at.is3G(paramContext)) || (at.is4G(paramContext)))
                {
                  ab.i("MicroMsg.ContactsUtil", "The network status is wifi or 3G or 4G.");
                  localObject3 = ((Cursor)localObject5).getString(((Cursor)localObject5).getColumnIndex("data_sync1"));
                  ab.i("MicroMsg.ContactsUtil", "get sync avatar url : [%s]", new Object[] { localObject3 });
                  if (!bo.isNullOrNil((String)localObject3))
                  {
                    i = ((String)localObject3).lastIndexOf("https:");
                    ab.i("MicroMsg.ContactsUtil", "check is exist https download url :[%d]", new Object[] { Integer.valueOf(i) });
                    if (i >= 0)
                    {
                      localObject2 = ((String)localObject3).substring(i);
                      localObject3 = vs((String)localObject2);
                      ab.i("MicroMsg.ContactsUtil", "Get image from google sync account in profile,url:[%s]", new Object[] { localObject2 });
                      localObject2 = localObject3;
                      if (localObject3 == null)
                        break label413;
                      localObject2 = localObject3;
                      if (((Bitmap)localObject3).isRecycled())
                        break label413;
                      ((Cursor)localObject5).close();
                      AppMethodBeat.o(124531);
                      paramContext = (Context)localObject3;
                      continue;
                      localException1 = localException1;
                      ab.printErrStackTrace("MicroMsg.ContactsUtil", localException1, "", new Object[0]);
                      ab.d("MicroMsg.ContactsUtil", "query crashed");
                    }
                  }
                }
              }
            }
            catch (Exception localException2)
            {
              while (true)
              {
                ab.printErrStackTrace("MicroMsg.ContactsUtil", localException2, "", new Object[0]);
                ab.d("MicroMsg.ContactsUtil", "query crashed");
                localObject5 = localObject2;
              }
              localObject2 = null;
              i = ((Cursor)localObject5).getColumnIndex("data15");
              localObject4 = localObject2;
              if (i != -1)
              {
                localObject1 = ((Cursor)localObject5).getBlob(i);
                ab.i("MicroMsg.ContactsUtil", "get bitmap data is null : [%b]", new Object[] { Boolean.valueOf(bo.cb((byte[])localObject1)) });
                localObject4 = localObject2;
                if (!bo.cb((byte[])localObject1))
                {
                  ab.i("MicroMsg.ContactsUtil", "Get image from profile personal icon.");
                  localObject4 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length);
                }
              }
            }
          }
        }
      }
    }
    while (true)
    {
      ((Cursor)localObject5).close();
      while (true)
      {
        if (localObject4 != null)
        {
          localObject2 = localObject4;
          if (!((Bitmap)localObject4).isRecycled())
            break label850;
        }
        localObject1 = H(paramContext, w.ct(paramContext));
        if (!bo.isNullOrNil((String)localObject1))
          break label558;
        ab.i("MicroMsg.ContactsUtil", "contactId is null.");
        paramContext = null;
        AppMethodBeat.o(124531);
        break;
        label546: ((Cursor)localObject2).close();
        localObject4 = localObject1;
      }
      label558: localObject5 = localContentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] { "photo_id", "raw_contact_id" }, "contact_id=?", new String[] { localObject1 }, null);
      localObject2 = localObject4;
      Cursor localCursor;
      if (localObject5 != null)
      {
        localObject2 = localObject4;
        if (((Cursor)localObject5).moveToFirst())
        {
          if ((!at.isWifi(paramContext)) && (!at.is3G(paramContext)))
          {
            localObject2 = localObject4;
            if (!at.is4G(paramContext))
              break label867;
          }
          ab.i("MicroMsg.ContactsUtil", "The network status is wifi or 3G or 4G.");
          localObject2 = ((Cursor)localObject5).getString(((Cursor)localObject5).getColumnIndex("raw_contact_id"));
          localCursor = localContentResolver.query(ContactsContract.Data.CONTENT_URI, new String[] { "data15", "data_sync1" }, "mimetype=? AND raw_contact_id=?", new String[] { "vnd.android.cursor.item/photo", localObject2 }, null);
          localObject2 = localObject4;
          if (localCursor == null)
            break label867;
          localObject2 = localObject4;
          if (localCursor.moveToFirst())
          {
            i = localCursor.getColumnIndex("data_sync1");
            localObject2 = localObject4;
            if (i != -1)
            {
              String str = localCursor.getString(i);
              localObject2 = localObject4;
              if (!bo.isNullOrNil(str))
              {
                i = str.lastIndexOf("https:");
                localObject2 = localObject4;
                if (i >= 0)
                {
                  str = str.substring(i);
                  localObject4 = vs(str);
                  localObject2 = localObject4;
                  if (localObject4 != null)
                  {
                    localObject2 = localObject4;
                    if (!((Bitmap)localObject4).isRecycled())
                    {
                      ab.i("MicroMsg.ContactsUtil", "Get image from google sync account in contacts,url:[%s]", new Object[] { str });
                      localCursor.close();
                      localObject2 = localObject4;
                    }
                  }
                }
              }
            }
          }
        }
        else
        {
          label843: ((Cursor)localObject5).close();
        }
      }
      else
      {
        label850: AppMethodBeat.o(124531);
        paramContext = (Context)localObject2;
        break;
      }
      localCursor.close();
      label867: ab.i("MicroMsg.ContactsUtil", "Get bitmap from contacts icon.");
      i = ((Cursor)localObject5).getColumnIndex("photo_id");
      long l;
      if (i != -1)
      {
        l = ((Cursor)localObject5).getLong(i);
        ab.i("MicroMsg.ContactsUtil", "Have got photoId,photoId is ".concat(String.valueOf(l)));
      }
      while (true)
      {
        if (l > 0L)
        {
          localObject2 = BitmapFactory.decodeStream(ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, bo.getLong((String)localObject1, 0L))));
          localObject4 = localObject2;
          if (localObject2 == null)
            break label976;
          localObject4 = localObject2;
          if (((Bitmap)localObject2).isRecycled())
            break label976;
          ab.i("MicroMsg.ContactsUtil", "Get image from contacts through google account.");
          break label843;
        }
        localObject4 = localObject2;
        label976: if (!((Cursor)localObject5).moveToNext())
        {
          localObject2 = localObject4;
          break label843;
        }
        break;
        l = 0L;
      }
      label1001: localObject4 = null;
    }
  }

  // ERROR //
  @TargetApi(14)
  public static String getPhoneNum(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc_w 298
    //   3: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 17
    //   8: ldc_w 300
    //   11: iconst_1
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_1
    //   18: aastore
    //   19: invokestatic 24	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: aload_0
    //   23: ifnonnull +21 -> 44
    //   26: ldc 17
    //   28: ldc_w 302
    //   31: invokestatic 30	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: aconst_null
    //   35: astore_0
    //   36: ldc_w 298
    //   39: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: aload_0
    //   43: areturn
    //   44: aload_0
    //   45: ldc_w 304
    //   48: invokevirtual 308	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   51: checkcast 310	android/telephony/TelephonyManager
    //   54: astore_2
    //   55: aconst_null
    //   56: astore_1
    //   57: aload_2
    //   58: invokevirtual 314	android/telephony/TelephonyManager:getLine1Number	()Ljava/lang/String;
    //   61: astore_3
    //   62: aload_3
    //   63: astore_1
    //   64: aload_2
    //   65: invokevirtual 317	android/telephony/TelephonyManager:getSimCountryIso	()Ljava/lang/String;
    //   68: astore 4
    //   70: aload 4
    //   72: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   75: ifeq +1411 -> 1486
    //   78: aload_2
    //   79: invokevirtual 320	android/telephony/TelephonyManager:getNetworkCountryIso	()Ljava/lang/String;
    //   82: astore_1
    //   83: aload_1
    //   84: astore 4
    //   86: aload_1
    //   87: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   90: ifeq +11 -> 101
    //   93: invokestatic 326	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   96: invokevirtual 329	java/util/Locale:getCountry	()Ljava/lang/String;
    //   99: astore 4
    //   101: aload 4
    //   103: astore 5
    //   105: aload_3
    //   106: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   109: ifne +150 -> 259
    //   112: aload_3
    //   113: invokevirtual 332	java/lang/String:trim	()Ljava/lang/String;
    //   116: astore_0
    //   117: aload_0
    //   118: aload 5
    //   120: invokestatic 338	com/tencent/mm/sdk/platformtools/av:hR	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   123: astore_1
    //   124: ldc 17
    //   126: ldc_w 340
    //   129: iconst_3
    //   130: anewarray 4	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload_0
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: aload_1
    //   140: aastore
    //   141: dup
    //   142: iconst_2
    //   143: aload 5
    //   145: aastore
    //   146: invokestatic 24	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: aload_1
    //   150: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   153: ifne +1330 -> 1483
    //   156: aload_1
    //   157: invokevirtual 343	java/lang/String:length	()I
    //   160: istore 6
    //   162: aload_0
    //   163: ldc_w 345
    //   166: invokevirtual 348	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   169: ifeq +84 -> 253
    //   172: iconst_1
    //   173: istore 7
    //   175: aload_0
    //   176: iload 7
    //   178: iload 6
    //   180: iadd
    //   181: invokevirtual 214	java/lang/String:substring	(I)Ljava/lang/String;
    //   184: astore_0
    //   185: ldc 17
    //   187: ldc_w 350
    //   190: iconst_1
    //   191: anewarray 4	java/lang/Object
    //   194: dup
    //   195: iconst_0
    //   196: aload_0
    //   197: aastore
    //   198: invokestatic 24	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: ldc 17
    //   203: ldc_w 352
    //   206: invokestatic 43	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   209: ldc_w 298
    //   212: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   215: goto -173 -> 42
    //   218: astore 4
    //   220: aconst_null
    //   221: astore_2
    //   222: aload_1
    //   223: astore_3
    //   224: aload_2
    //   225: astore_1
    //   226: ldc 17
    //   228: aload 4
    //   230: ldc 142
    //   232: iconst_0
    //   233: anewarray 4	java/lang/Object
    //   236: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: ldc 17
    //   241: ldc_w 354
    //   244: invokestatic 30	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   247: aload_1
    //   248: astore 5
    //   250: goto -145 -> 105
    //   253: iconst_0
    //   254: istore 7
    //   256: goto -81 -> 175
    //   259: aload_0
    //   260: ldc 109
    //   262: invokestatic 114	com/tencent/mm/pluginsdk/permission/b:o	(Landroid/content/Context;Ljava/lang/String;)Z
    //   265: ifne +21 -> 286
    //   268: ldc 17
    //   270: ldc 116
    //   272: invokestatic 30	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   275: aconst_null
    //   276: astore_0
    //   277: ldc_w 298
    //   280: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: goto -241 -> 42
    //   286: aload_0
    //   287: invokevirtual 49	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   290: astore 8
    //   292: aconst_null
    //   293: astore 4
    //   295: aconst_null
    //   296: astore 9
    //   298: aconst_null
    //   299: astore_3
    //   300: aconst_null
    //   301: astore 10
    //   303: aconst_null
    //   304: astore_2
    //   305: aload 10
    //   307: astore_1
    //   308: bipush 14
    //   310: invokestatic 357	com/tencent/mm/compatible/util/d:fP	(I)Z
    //   313: ifne +316 -> 629
    //   316: ldc 17
    //   318: ldc_w 359
    //   321: invokestatic 43	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   324: aload 9
    //   326: astore_3
    //   327: aload 8
    //   329: getstatic 127	android/provider/ContactsContract$Profile:CONTENT_URI	Landroid/net/Uri;
    //   332: iconst_1
    //   333: anewarray 57	java/lang/String
    //   336: dup
    //   337: iconst_0
    //   338: ldc_w 361
    //   341: aastore
    //   342: aconst_null
    //   343: aconst_null
    //   344: aconst_null
    //   345: invokevirtual 69	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   348: astore_1
    //   349: aload_1
    //   350: ifnull +1127 -> 1477
    //   353: aload_1
    //   354: astore 4
    //   356: aload_1
    //   357: astore_3
    //   358: aload_1
    //   359: invokeinterface 75 1 0
    //   364: ifeq +1113 -> 1477
    //   367: aload_1
    //   368: astore 4
    //   370: aload_1
    //   371: astore_3
    //   372: aload_1
    //   373: ldc_w 361
    //   376: invokeinterface 79 2 0
    //   381: istore 7
    //   383: iload 7
    //   385: iconst_m1
    //   386: if_icmpeq +1091 -> 1477
    //   389: aload_1
    //   390: astore 4
    //   392: aload_1
    //   393: astore_3
    //   394: aload_1
    //   395: iload 7
    //   397: invokeinterface 365 2 0
    //   402: istore 7
    //   404: aload_1
    //   405: astore_3
    //   406: ldc 17
    //   408: ldc_w 367
    //   411: iload 7
    //   413: invokestatic 369	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   416: invokevirtual 274	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   419: invokestatic 43	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   422: iload 7
    //   424: istore 6
    //   426: aload_1
    //   427: astore 4
    //   429: aload_1
    //   430: ifnull +32 -> 462
    //   433: iload 7
    //   435: istore 6
    //   437: aload_1
    //   438: astore 4
    //   440: aload_1
    //   441: invokeinterface 372 1 0
    //   446: ifne +16 -> 462
    //   449: aload_1
    //   450: invokeinterface 89 1 0
    //   455: aload_1
    //   456: astore 4
    //   458: iload 7
    //   460: istore 6
    //   462: aload 10
    //   464: astore_1
    //   465: aload 4
    //   467: astore_3
    //   468: iload 6
    //   470: ifle +159 -> 629
    //   473: aload 8
    //   475: getstatic 127	android/provider/ContactsContract$Profile:CONTENT_URI	Landroid/net/Uri;
    //   478: ldc 168
    //   480: invokestatic 174	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   483: iconst_1
    //   484: anewarray 57	java/lang/String
    //   487: dup
    //   488: iconst_0
    //   489: ldc 61
    //   491: aastore
    //   492: ldc 180
    //   494: iconst_1
    //   495: anewarray 57	java/lang/String
    //   498: dup
    //   499: iconst_0
    //   500: ldc_w 374
    //   503: aastore
    //   504: aconst_null
    //   505: invokevirtual 69	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   508: astore_1
    //   509: aload_1
    //   510: ifnull +962 -> 1472
    //   513: aload_2
    //   514: astore_3
    //   515: aload_1
    //   516: astore 4
    //   518: aload_1
    //   519: invokeinterface 75 1 0
    //   524: ifeq +57 -> 581
    //   527: aload_1
    //   528: astore 4
    //   530: aload_1
    //   531: ldc 61
    //   533: invokeinterface 79 2 0
    //   538: istore 7
    //   540: aload_2
    //   541: astore_3
    //   542: iload 7
    //   544: iconst_m1
    //   545: if_icmpeq +36 -> 581
    //   548: aload_1
    //   549: astore 4
    //   551: aload_1
    //   552: iload 7
    //   554: invokeinterface 83 2 0
    //   559: astore_3
    //   560: aload_1
    //   561: astore 4
    //   563: aload_3
    //   564: astore_2
    //   565: ldc 17
    //   567: ldc_w 376
    //   570: iconst_1
    //   571: anewarray 4	java/lang/Object
    //   574: dup
    //   575: iconst_0
    //   576: aload_3
    //   577: aastore
    //   578: invokestatic 24	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   581: aload_1
    //   582: astore 4
    //   584: aload_3
    //   585: astore_2
    //   586: aload_1
    //   587: invokeinterface 89 1 0
    //   592: aload_3
    //   593: astore_2
    //   594: aload_1
    //   595: astore 4
    //   597: aload_1
    //   598: ifnull +866 -> 1464
    //   601: aload_3
    //   602: astore_2
    //   603: aload_1
    //   604: astore 4
    //   606: aload_1
    //   607: invokeinterface 372 1 0
    //   612: ifne +852 -> 1464
    //   615: aload_1
    //   616: invokeinterface 89 1 0
    //   621: aload_3
    //   622: astore 4
    //   624: aload_1
    //   625: astore_3
    //   626: aload 4
    //   628: astore_1
    //   629: aload_1
    //   630: astore 4
    //   632: aload_1
    //   633: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   636: ifeq +284 -> 920
    //   639: aload_0
    //   640: aload_0
    //   641: invokestatic 136	com/tencent/mm/platformtools/w:ct	(Landroid/content/Context;)Ljava/lang/String;
    //   644: invokestatic 138	com/tencent/mm/platformtools/i:H	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   647: astore 10
    //   649: aload_1
    //   650: astore 4
    //   652: aload 10
    //   654: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   657: ifne +263 -> 920
    //   660: aload 8
    //   662: getstatic 277	android/provider/ContactsContract$Contacts:CONTENT_URI	Landroid/net/Uri;
    //   665: iconst_1
    //   666: anewarray 57	java/lang/String
    //   669: dup
    //   670: iconst_0
    //   671: ldc_w 361
    //   674: aastore
    //   675: ldc_w 378
    //   678: iconst_1
    //   679: anewarray 57	java/lang/String
    //   682: dup
    //   683: iconst_0
    //   684: aload 10
    //   686: aastore
    //   687: aconst_null
    //   688: invokevirtual 69	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   691: astore_0
    //   692: aload_0
    //   693: ifnull +765 -> 1458
    //   696: aload_0
    //   697: astore_3
    //   698: aload_0
    //   699: invokeinterface 75 1 0
    //   704: ifeq +754 -> 1458
    //   707: aload_0
    //   708: astore_3
    //   709: aload_0
    //   710: aload_0
    //   711: ldc_w 361
    //   714: invokeinterface 79 2 0
    //   719: invokeinterface 365 2 0
    //   724: istore 7
    //   726: aload_0
    //   727: ifnull +728 -> 1455
    //   730: aload_0
    //   731: invokeinterface 89 1 0
    //   736: ldc 17
    //   738: ldc_w 367
    //   741: iload 7
    //   743: invokestatic 369	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   746: invokevirtual 274	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   749: invokestatic 43	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   752: aload_1
    //   753: astore 4
    //   755: iload 7
    //   757: ifle +163 -> 920
    //   760: aload_1
    //   761: astore_3
    //   762: aload_0
    //   763: astore_2
    //   764: aload 8
    //   766: getstatic 251	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   769: iconst_2
    //   770: anewarray 57	java/lang/String
    //   773: dup
    //   774: iconst_0
    //   775: ldc 61
    //   777: aastore
    //   778: dup
    //   779: iconst_1
    //   780: ldc_w 380
    //   783: aastore
    //   784: ldc_w 382
    //   787: iconst_1
    //   788: anewarray 57	java/lang/String
    //   791: dup
    //   792: iconst_0
    //   793: aload 10
    //   795: aastore
    //   796: aconst_null
    //   797: invokevirtual 69	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   800: astore 9
    //   802: aload_1
    //   803: astore 10
    //   805: aload 9
    //   807: ifnull +93 -> 900
    //   810: aload_1
    //   811: astore 10
    //   813: aload_1
    //   814: astore_3
    //   815: aload 9
    //   817: astore_2
    //   818: aload 9
    //   820: astore_0
    //   821: aload 9
    //   823: invokeinterface 75 1 0
    //   828: ifeq +72 -> 900
    //   831: aload_1
    //   832: astore_3
    //   833: aload 9
    //   835: astore_2
    //   836: aload 9
    //   838: astore_0
    //   839: aload 9
    //   841: aload 9
    //   843: ldc 61
    //   845: invokeinterface 79 2 0
    //   850: invokeinterface 83 2 0
    //   855: astore 10
    //   857: aload 10
    //   859: astore_3
    //   860: aload 9
    //   862: astore_2
    //   863: aload 9
    //   865: astore_0
    //   866: aload 10
    //   868: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   871: ifne +431 -> 1302
    //   874: aload 10
    //   876: astore_3
    //   877: aload 9
    //   879: astore_2
    //   880: aload 9
    //   882: astore_0
    //   883: ldc 17
    //   885: ldc_w 384
    //   888: iconst_1
    //   889: anewarray 4	java/lang/Object
    //   892: dup
    //   893: iconst_0
    //   894: aload 10
    //   896: aastore
    //   897: invokestatic 24	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   900: aload 10
    //   902: astore 4
    //   904: aload 9
    //   906: ifnull +14 -> 920
    //   909: aload 9
    //   911: invokeinterface 89 1 0
    //   916: aload 10
    //   918: astore 4
    //   920: aload 4
    //   922: astore_1
    //   923: aload 4
    //   925: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   928: ifne +102 -> 1030
    //   931: aload 4
    //   933: aload 5
    //   935: invokestatic 338	com/tencent/mm/sdk/platformtools/av:hR	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   938: astore_3
    //   939: ldc 17
    //   941: ldc_w 386
    //   944: iconst_3
    //   945: anewarray 4	java/lang/Object
    //   948: dup
    //   949: iconst_0
    //   950: aload 4
    //   952: aastore
    //   953: dup
    //   954: iconst_1
    //   955: aload_3
    //   956: aastore
    //   957: dup
    //   958: iconst_2
    //   959: aload 5
    //   961: aastore
    //   962: invokestatic 24	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   965: aload 4
    //   967: astore_1
    //   968: aload_3
    //   969: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   972: ifne +42 -> 1014
    //   975: aload 4
    //   977: ldc_w 345
    //   980: invokevirtual 348	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   983: ifeq +401 -> 1384
    //   986: ldc_w 345
    //   989: aload_3
    //   990: invokestatic 389	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   993: invokevirtual 274	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   996: astore_0
    //   997: aload 4
    //   999: astore_1
    //   1000: aload_0
    //   1001: ifnull +13 -> 1014
    //   1004: aload 4
    //   1006: aload_0
    //   1007: invokevirtual 343	java/lang/String:length	()I
    //   1010: invokevirtual 214	java/lang/String:substring	(I)Ljava/lang/String;
    //   1013: astore_1
    //   1014: ldc 17
    //   1016: ldc_w 391
    //   1019: iconst_1
    //   1020: anewarray 4	java/lang/Object
    //   1023: dup
    //   1024: iconst_0
    //   1025: aload_1
    //   1026: aastore
    //   1027: invokestatic 24	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1030: ldc_w 298
    //   1033: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1036: aload_1
    //   1037: astore_0
    //   1038: goto -996 -> 42
    //   1041: astore_3
    //   1042: iconst_0
    //   1043: istore 7
    //   1045: aload 4
    //   1047: astore_1
    //   1048: aload_3
    //   1049: astore 4
    //   1051: aload_1
    //   1052: astore_3
    //   1053: ldc 17
    //   1055: aload 4
    //   1057: ldc 142
    //   1059: iconst_0
    //   1060: anewarray 4	java/lang/Object
    //   1063: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1066: aload_1
    //   1067: astore_3
    //   1068: ldc 17
    //   1070: ldc 144
    //   1072: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1075: iload 7
    //   1077: istore 6
    //   1079: aload_1
    //   1080: astore 4
    //   1082: aload_1
    //   1083: ifnull -621 -> 462
    //   1086: iload 7
    //   1088: istore 6
    //   1090: aload_1
    //   1091: astore 4
    //   1093: aload_1
    //   1094: invokeinterface 372 1 0
    //   1099: ifne -637 -> 462
    //   1102: aload_1
    //   1103: invokeinterface 89 1 0
    //   1108: iload 7
    //   1110: istore 6
    //   1112: aload_1
    //   1113: astore 4
    //   1115: goto -653 -> 462
    //   1118: astore_0
    //   1119: aload_3
    //   1120: ifnull +18 -> 1138
    //   1123: aload_3
    //   1124: invokeinterface 372 1 0
    //   1129: ifne +9 -> 1138
    //   1132: aload_3
    //   1133: invokeinterface 89 1 0
    //   1138: ldc_w 298
    //   1141: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1144: aload_0
    //   1145: athrow
    //   1146: astore_2
    //   1147: aconst_null
    //   1148: astore_3
    //   1149: aload 4
    //   1151: astore_1
    //   1152: aload_1
    //   1153: astore 4
    //   1155: ldc 17
    //   1157: aload_2
    //   1158: ldc 142
    //   1160: iconst_0
    //   1161: anewarray 4	java/lang/Object
    //   1164: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1167: aload_1
    //   1168: astore 4
    //   1170: ldc 17
    //   1172: ldc 144
    //   1174: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1177: aload_3
    //   1178: astore_2
    //   1179: aload_1
    //   1180: astore 4
    //   1182: aload_1
    //   1183: ifnull +281 -> 1464
    //   1186: aload_3
    //   1187: astore_2
    //   1188: aload_1
    //   1189: astore 4
    //   1191: aload_1
    //   1192: invokeinterface 372 1 0
    //   1197: ifne +267 -> 1464
    //   1200: aload_1
    //   1201: invokeinterface 89 1 0
    //   1206: aload_1
    //   1207: astore 4
    //   1209: aload_3
    //   1210: astore_1
    //   1211: aload 4
    //   1213: astore_3
    //   1214: goto -585 -> 629
    //   1217: astore_0
    //   1218: aload 4
    //   1220: ifnull +20 -> 1240
    //   1223: aload 4
    //   1225: invokeinterface 372 1 0
    //   1230: ifne +10 -> 1240
    //   1233: aload 4
    //   1235: invokeinterface 89 1 0
    //   1240: ldc_w 298
    //   1243: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1246: aload_0
    //   1247: athrow
    //   1248: astore 4
    //   1250: aload_3
    //   1251: astore_0
    //   1252: aload_0
    //   1253: astore_3
    //   1254: ldc 17
    //   1256: aload 4
    //   1258: ldc 142
    //   1260: iconst_0
    //   1261: anewarray 4	java/lang/Object
    //   1264: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1267: aload_0
    //   1268: ifnull +181 -> 1449
    //   1271: aload_0
    //   1272: invokeinterface 89 1 0
    //   1277: iconst_0
    //   1278: istore 7
    //   1280: goto -544 -> 736
    //   1283: astore_0
    //   1284: aload_3
    //   1285: ifnull +9 -> 1294
    //   1288: aload_3
    //   1289: invokeinterface 89 1 0
    //   1294: ldc_w 298
    //   1297: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1300: aload_0
    //   1301: athrow
    //   1302: aload 10
    //   1304: astore_3
    //   1305: aload 9
    //   1307: astore_2
    //   1308: aload 9
    //   1310: astore_0
    //   1311: aload 9
    //   1313: invokeinterface 92 1 0
    //   1318: istore 11
    //   1320: aload 10
    //   1322: astore_1
    //   1323: iload 11
    //   1325: ifne -494 -> 831
    //   1328: goto -428 -> 900
    //   1331: astore_1
    //   1332: aload_2
    //   1333: astore_0
    //   1334: ldc 17
    //   1336: aload_1
    //   1337: ldc 142
    //   1339: iconst_0
    //   1340: anewarray 4	java/lang/Object
    //   1343: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1346: aload_3
    //   1347: astore 4
    //   1349: aload_2
    //   1350: ifnull -430 -> 920
    //   1353: aload_2
    //   1354: invokeinterface 89 1 0
    //   1359: aload_3
    //   1360: astore 4
    //   1362: goto -442 -> 920
    //   1365: astore_1
    //   1366: aload_0
    //   1367: ifnull +9 -> 1376
    //   1370: aload_0
    //   1371: invokeinterface 89 1 0
    //   1376: ldc_w 298
    //   1379: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1382: aload_1
    //   1383: athrow
    //   1384: aload_3
    //   1385: astore_0
    //   1386: aload 4
    //   1388: aload_3
    //   1389: invokevirtual 348	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1392: ifne -395 -> 997
    //   1395: aconst_null
    //   1396: astore_0
    //   1397: goto -400 -> 997
    //   1400: astore_0
    //   1401: goto -117 -> 1284
    //   1404: astore 4
    //   1406: goto -154 -> 1252
    //   1409: astore_0
    //   1410: goto -192 -> 1218
    //   1413: astore_2
    //   1414: aconst_null
    //   1415: astore_3
    //   1416: goto -264 -> 1152
    //   1419: astore 4
    //   1421: aload_2
    //   1422: astore_3
    //   1423: aload 4
    //   1425: astore_2
    //   1426: goto -274 -> 1152
    //   1429: astore 4
    //   1431: goto -380 -> 1051
    //   1434: astore_2
    //   1435: aload 4
    //   1437: astore_1
    //   1438: aload_2
    //   1439: astore 4
    //   1441: goto -1215 -> 226
    //   1444: astore 4
    //   1446: goto -1220 -> 226
    //   1449: iconst_0
    //   1450: istore 7
    //   1452: goto -716 -> 736
    //   1455: goto -719 -> 736
    //   1458: iconst_0
    //   1459: istore 7
    //   1461: goto -735 -> 726
    //   1464: aload_2
    //   1465: astore_1
    //   1466: aload 4
    //   1468: astore_3
    //   1469: goto -840 -> 629
    //   1472: aconst_null
    //   1473: astore_3
    //   1474: goto -882 -> 592
    //   1477: iconst_0
    //   1478: istore 7
    //   1480: goto -1076 -> 404
    //   1483: goto -1282 -> 201
    //   1486: aload 4
    //   1488: astore_1
    //   1489: goto -1406 -> 83
    //
    // Exception table:
    //   from	to	target	type
    //   57	62	218	java/lang/Exception
    //   64	70	218	java/lang/Exception
    //   327	349	1041	java/lang/Exception
    //   358	367	1041	java/lang/Exception
    //   372	383	1041	java/lang/Exception
    //   394	404	1041	java/lang/Exception
    //   327	349	1118	finally
    //   358	367	1118	finally
    //   372	383	1118	finally
    //   394	404	1118	finally
    //   406	422	1118	finally
    //   1053	1066	1118	finally
    //   1068	1075	1118	finally
    //   473	509	1146	java/lang/Exception
    //   473	509	1217	finally
    //   660	692	1248	java/lang/Exception
    //   660	692	1283	finally
    //   764	802	1331	java/lang/Exception
    //   821	831	1331	java/lang/Exception
    //   839	857	1331	java/lang/Exception
    //   866	874	1331	java/lang/Exception
    //   883	900	1331	java/lang/Exception
    //   1311	1320	1331	java/lang/Exception
    //   764	802	1365	finally
    //   821	831	1365	finally
    //   839	857	1365	finally
    //   866	874	1365	finally
    //   883	900	1365	finally
    //   1311	1320	1365	finally
    //   1334	1346	1365	finally
    //   698	707	1400	finally
    //   709	726	1400	finally
    //   1254	1267	1400	finally
    //   698	707	1404	java/lang/Exception
    //   709	726	1404	java/lang/Exception
    //   518	527	1409	finally
    //   530	540	1409	finally
    //   551	560	1409	finally
    //   565	581	1409	finally
    //   586	592	1409	finally
    //   1155	1167	1409	finally
    //   1170	1177	1409	finally
    //   518	527	1413	java/lang/Exception
    //   530	540	1413	java/lang/Exception
    //   551	560	1413	java/lang/Exception
    //   565	581	1419	java/lang/Exception
    //   586	592	1419	java/lang/Exception
    //   406	422	1429	java/lang/Exception
    //   70	83	1434	java/lang/Exception
    //   86	101	1444	java/lang/Exception
  }

  // ERROR //
  private static Bitmap vs(String paramString)
  {
    // Byte code:
    //   0: ldc_w 394
    //   3: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 17
    //   8: ldc_w 396
    //   11: iconst_1
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_0
    //   18: aastore
    //   19: invokestatic 24	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: aload_0
    //   23: invokestatic 39	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   26: ifeq +21 -> 47
    //   29: ldc 17
    //   31: ldc_w 398
    //   34: invokestatic 30	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: ldc_w 394
    //   40: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   43: aconst_null
    //   44: astore_0
    //   45: aload_0
    //   46: areturn
    //   47: aload_0
    //   48: invokevirtual 332	java/lang/String:trim	()Ljava/lang/String;
    //   51: astore_1
    //   52: aload_1
    //   53: ldc 200
    //   55: invokevirtual 348	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   58: ifne +22 -> 80
    //   61: ldc 17
    //   63: ldc_w 400
    //   66: invokestatic 30	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   69: ldc_w 394
    //   72: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   75: aconst_null
    //   76: astore_0
    //   77: goto -32 -> 45
    //   80: new 402	java/io/ByteArrayOutputStream
    //   83: dup
    //   84: invokespecial 405	java/io/ByteArrayOutputStream:<init>	()V
    //   87: astore_2
    //   88: aload_1
    //   89: invokestatic 411	com/tencent/mm/network/b:vb	(Ljava/lang/String;)Lcom/tencent/mm/network/v;
    //   92: astore_0
    //   93: aload_0
    //   94: getfield 417	com/tencent/mm/network/v:gdG	Ljavax/net/ssl/HttpsURLConnection;
    //   97: invokevirtual 423	javax/net/ssl/HttpsURLConnection:getInputStream	()Ljava/io/InputStream;
    //   100: astore_3
    //   101: aload_3
    //   102: ifnonnull +90 -> 192
    //   105: aload_0
    //   106: astore 4
    //   108: aload_3
    //   109: astore 5
    //   111: ldc 17
    //   113: ldc_w 425
    //   116: iconst_1
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_1
    //   123: aastore
    //   124: invokestatic 427	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload_0
    //   128: getfield 417	com/tencent/mm/network/v:gdG	Ljavax/net/ssl/HttpsURLConnection;
    //   131: invokevirtual 430	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   134: aload_3
    //   135: ifnull +7 -> 142
    //   138: aload_3
    //   139: invokevirtual 433	java/io/InputStream:close	()V
    //   142: aload_2
    //   143: invokevirtual 434	java/io/ByteArrayOutputStream:close	()V
    //   146: ldc_w 394
    //   149: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: aconst_null
    //   153: astore_0
    //   154: goto -109 -> 45
    //   157: astore_0
    //   158: ldc 17
    //   160: ldc_w 436
    //   163: iconst_1
    //   164: anewarray 4	java/lang/Object
    //   167: dup
    //   168: iconst_0
    //   169: aload_0
    //   170: invokevirtual 439	java/io/IOException:getMessage	()Ljava/lang/String;
    //   173: aastore
    //   174: invokestatic 427	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: ldc 17
    //   179: aload_0
    //   180: ldc 142
    //   182: iconst_0
    //   183: anewarray 4	java/lang/Object
    //   186: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   189: goto -43 -> 146
    //   192: aload_0
    //   193: astore 4
    //   195: aload_3
    //   196: astore 5
    //   198: sipush 1024
    //   201: newarray byte
    //   203: astore_1
    //   204: aload_0
    //   205: astore 4
    //   207: aload_3
    //   208: astore 5
    //   210: aload_3
    //   211: aload_1
    //   212: invokevirtual 443	java/io/InputStream:read	([B)I
    //   215: istore 6
    //   217: iload 6
    //   219: iconst_m1
    //   220: if_icmpeq +103 -> 323
    //   223: aload_0
    //   224: astore 4
    //   226: aload_3
    //   227: astore 5
    //   229: aload_2
    //   230: aload_1
    //   231: iconst_0
    //   232: iload 6
    //   234: invokevirtual 447	java/io/ByteArrayOutputStream:write	([BII)V
    //   237: goto -33 -> 204
    //   240: astore 7
    //   242: aconst_null
    //   243: astore_1
    //   244: aload_0
    //   245: astore 4
    //   247: aload_3
    //   248: astore 5
    //   250: ldc 17
    //   252: ldc_w 449
    //   255: iconst_1
    //   256: anewarray 4	java/lang/Object
    //   259: dup
    //   260: iconst_0
    //   261: aload 7
    //   263: invokevirtual 439	java/io/IOException:getMessage	()Ljava/lang/String;
    //   266: aastore
    //   267: invokestatic 427	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   270: aload_0
    //   271: astore 4
    //   273: aload_3
    //   274: astore 5
    //   276: ldc 17
    //   278: aload 7
    //   280: ldc 142
    //   282: iconst_0
    //   283: anewarray 4	java/lang/Object
    //   286: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   289: aload_0
    //   290: ifnull +10 -> 300
    //   293: aload_0
    //   294: getfield 417	com/tencent/mm/network/v:gdG	Ljavax/net/ssl/HttpsURLConnection;
    //   297: invokevirtual 430	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   300: aload_3
    //   301: ifnull +7 -> 308
    //   304: aload_3
    //   305: invokevirtual 433	java/io/InputStream:close	()V
    //   308: aload_2
    //   309: invokevirtual 434	java/io/ByteArrayOutputStream:close	()V
    //   312: aload_1
    //   313: astore_0
    //   314: ldc_w 394
    //   317: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   320: goto -275 -> 45
    //   323: aload_0
    //   324: astore 4
    //   326: aload_3
    //   327: astore 5
    //   329: aload_2
    //   330: invokevirtual 453	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   333: invokestatic 459	com/tencent/mm/sdk/platformtools/d:bQ	([B)Landroid/graphics/Bitmap;
    //   336: astore_1
    //   337: aload_0
    //   338: astore 4
    //   340: aload_3
    //   341: astore 5
    //   343: aload_2
    //   344: invokevirtual 434	java/io/ByteArrayOutputStream:close	()V
    //   347: aload_0
    //   348: getfield 417	com/tencent/mm/network/v:gdG	Ljavax/net/ssl/HttpsURLConnection;
    //   351: invokevirtual 430	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   354: aload_1
    //   355: astore_0
    //   356: aload_3
    //   357: ifnull -43 -> 314
    //   360: aload_3
    //   361: invokevirtual 433	java/io/InputStream:close	()V
    //   364: aload_1
    //   365: astore_0
    //   366: goto -52 -> 314
    //   369: astore_0
    //   370: ldc 17
    //   372: ldc_w 436
    //   375: iconst_1
    //   376: anewarray 4	java/lang/Object
    //   379: dup
    //   380: iconst_0
    //   381: aload_0
    //   382: invokevirtual 439	java/io/IOException:getMessage	()Ljava/lang/String;
    //   385: aastore
    //   386: invokestatic 427	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   389: ldc 17
    //   391: aload_0
    //   392: ldc 142
    //   394: iconst_0
    //   395: anewarray 4	java/lang/Object
    //   398: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   401: aload_1
    //   402: astore_0
    //   403: goto -89 -> 314
    //   406: astore_0
    //   407: ldc 17
    //   409: ldc_w 436
    //   412: iconst_1
    //   413: anewarray 4	java/lang/Object
    //   416: dup
    //   417: iconst_0
    //   418: aload_0
    //   419: invokevirtual 439	java/io/IOException:getMessage	()Ljava/lang/String;
    //   422: aastore
    //   423: invokestatic 427	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   426: ldc 17
    //   428: aload_0
    //   429: ldc 142
    //   431: iconst_0
    //   432: anewarray 4	java/lang/Object
    //   435: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   438: aload_1
    //   439: astore_0
    //   440: goto -126 -> 314
    //   443: astore 7
    //   445: aconst_null
    //   446: astore_0
    //   447: aconst_null
    //   448: astore_3
    //   449: aconst_null
    //   450: astore_1
    //   451: aload_0
    //   452: astore 4
    //   454: aload_3
    //   455: astore 5
    //   457: ldc 17
    //   459: ldc_w 461
    //   462: iconst_1
    //   463: anewarray 4	java/lang/Object
    //   466: dup
    //   467: iconst_0
    //   468: aload 7
    //   470: invokevirtual 462	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   473: aastore
    //   474: invokestatic 427	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   477: aload_0
    //   478: astore 4
    //   480: aload_3
    //   481: astore 5
    //   483: ldc 17
    //   485: aload 7
    //   487: ldc 142
    //   489: iconst_0
    //   490: anewarray 4	java/lang/Object
    //   493: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   496: aload_0
    //   497: ifnull +10 -> 507
    //   500: aload_0
    //   501: getfield 417	com/tencent/mm/network/v:gdG	Ljavax/net/ssl/HttpsURLConnection;
    //   504: invokevirtual 430	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   507: aload_3
    //   508: ifnull +7 -> 515
    //   511: aload_3
    //   512: invokevirtual 433	java/io/InputStream:close	()V
    //   515: aload_2
    //   516: invokevirtual 434	java/io/ByteArrayOutputStream:close	()V
    //   519: aload_1
    //   520: astore_0
    //   521: goto -207 -> 314
    //   524: astore_0
    //   525: ldc 17
    //   527: ldc_w 436
    //   530: iconst_1
    //   531: anewarray 4	java/lang/Object
    //   534: dup
    //   535: iconst_0
    //   536: aload_0
    //   537: invokevirtual 439	java/io/IOException:getMessage	()Ljava/lang/String;
    //   540: aastore
    //   541: invokestatic 427	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   544: ldc 17
    //   546: aload_0
    //   547: ldc 142
    //   549: iconst_0
    //   550: anewarray 4	java/lang/Object
    //   553: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   556: aload_1
    //   557: astore_0
    //   558: goto -244 -> 314
    //   561: astore_1
    //   562: aconst_null
    //   563: astore_0
    //   564: aconst_null
    //   565: astore 5
    //   567: aload_0
    //   568: ifnull +10 -> 578
    //   571: aload_0
    //   572: getfield 417	com/tencent/mm/network/v:gdG	Ljavax/net/ssl/HttpsURLConnection;
    //   575: invokevirtual 430	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   578: aload 5
    //   580: ifnull +8 -> 588
    //   583: aload 5
    //   585: invokevirtual 433	java/io/InputStream:close	()V
    //   588: aload_2
    //   589: invokevirtual 434	java/io/ByteArrayOutputStream:close	()V
    //   592: ldc_w 394
    //   595: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   598: aload_1
    //   599: athrow
    //   600: astore_0
    //   601: ldc 17
    //   603: ldc_w 436
    //   606: iconst_1
    //   607: anewarray 4	java/lang/Object
    //   610: dup
    //   611: iconst_0
    //   612: aload_0
    //   613: invokevirtual 439	java/io/IOException:getMessage	()Ljava/lang/String;
    //   616: aastore
    //   617: invokestatic 427	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   620: ldc 17
    //   622: aload_0
    //   623: ldc 142
    //   625: iconst_0
    //   626: anewarray 4	java/lang/Object
    //   629: invokestatic 98	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   632: goto -40 -> 592
    //   635: astore_1
    //   636: aconst_null
    //   637: astore 5
    //   639: goto -72 -> 567
    //   642: astore_1
    //   643: aload 4
    //   645: astore_0
    //   646: goto -79 -> 567
    //   649: astore 7
    //   651: aconst_null
    //   652: astore_3
    //   653: aconst_null
    //   654: astore_1
    //   655: goto -204 -> 451
    //   658: astore 7
    //   660: aconst_null
    //   661: astore_1
    //   662: goto -211 -> 451
    //   665: astore 7
    //   667: goto -216 -> 451
    //   670: astore 7
    //   672: aconst_null
    //   673: astore_0
    //   674: aconst_null
    //   675: astore_3
    //   676: aconst_null
    //   677: astore_1
    //   678: goto -434 -> 244
    //   681: astore 7
    //   683: aconst_null
    //   684: astore_3
    //   685: aconst_null
    //   686: astore_1
    //   687: goto -443 -> 244
    //   690: astore 7
    //   692: goto -448 -> 244
    //
    // Exception table:
    //   from	to	target	type
    //   127	134	157	java/io/IOException
    //   138	142	157	java/io/IOException
    //   142	146	157	java/io/IOException
    //   111	127	240	java/io/IOException
    //   198	204	240	java/io/IOException
    //   210	217	240	java/io/IOException
    //   229	237	240	java/io/IOException
    //   329	337	240	java/io/IOException
    //   347	354	369	java/io/IOException
    //   360	364	369	java/io/IOException
    //   293	300	406	java/io/IOException
    //   304	308	406	java/io/IOException
    //   308	312	406	java/io/IOException
    //   88	93	443	java/lang/Exception
    //   500	507	524	java/io/IOException
    //   511	515	524	java/io/IOException
    //   515	519	524	java/io/IOException
    //   88	93	561	finally
    //   571	578	600	java/io/IOException
    //   583	588	600	java/io/IOException
    //   588	592	600	java/io/IOException
    //   93	101	635	finally
    //   111	127	642	finally
    //   198	204	642	finally
    //   210	217	642	finally
    //   229	237	642	finally
    //   250	270	642	finally
    //   276	289	642	finally
    //   329	337	642	finally
    //   343	347	642	finally
    //   457	477	642	finally
    //   483	496	642	finally
    //   93	101	649	java/lang/Exception
    //   111	127	658	java/lang/Exception
    //   198	204	658	java/lang/Exception
    //   210	217	658	java/lang/Exception
    //   229	237	658	java/lang/Exception
    //   329	337	658	java/lang/Exception
    //   343	347	665	java/lang/Exception
    //   88	93	670	java/io/IOException
    //   93	101	681	java/io/IOException
    //   343	347	690	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.i
 * JD-Core Version:    0.6.2
 */