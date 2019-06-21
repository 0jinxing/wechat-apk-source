package com.tencent.mm.plugin.account.model;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;

public final class b$b
  implements b.a
{
  private String gyD;
  private int toScene;
  private Uri uri;

  public b$b(int paramInt, String paramString, Uri paramUri)
  {
    this.toScene = paramInt;
    this.gyD = paramString;
    this.uri = paramUri;
  }

  private int d(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(124660);
    Object localObject = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW(paramString1);
    int i;
    if (paramContext == null)
    {
      ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null context");
      AppMethodBeat.o(124660);
      i = 1;
    }
    while (true)
    {
      return i;
      if (localObject == null)
      {
        ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "this user is not my friend");
        AppMethodBeat.o(124660);
        i = 1;
      }
      else
      {
        localObject = ((com.tencent.mm.plugin.account.friend.a.a)localObject).getUsername();
        if (!bo.isNullOrNil((String)localObject))
          break;
        ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "get username failed, phonenum md5 is ".concat(String.valueOf(paramString1)));
        AppMethodBeat.o(124660);
        i = 1;
      }
    }
    if (((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoJ((String)localObject))
    {
      h.pYm.e(11157, new Object[] { Integer.valueOf(this.toScene) });
      switch (this.toScene)
      {
      default:
      case 1:
      case 3:
      case 4:
      case 2:
      }
    }
    while (true)
    {
      AppMethodBeat.o(124660);
      i = 1;
      break;
      paramString1 = new Intent();
      paramString1.putExtra("Chat_User", (String)localObject);
      paramString1.putExtra("finish_direct", true);
      paramString1.addFlags(67108864);
      com.tencent.mm.plugin.account.a.a.gkE.d(paramString1, paramContext);
      AppMethodBeat.o(124660);
      i = 0;
      break;
      paramString1 = new ui();
      paramString1.cQx.cAd = 5;
      paramString1.cQx.talker = ((String)localObject);
      paramString1.cQx.context = paramContext;
      paramString1.cQx.cQs = 3;
      com.tencent.mm.sdk.b.a.xxA.m(paramString1);
      AppMethodBeat.o(124660);
      i = 0;
      break;
      paramString1 = new ui();
      paramString1.cQx.cAd = 5;
      paramString1.cQx.talker = ((String)localObject);
      paramString1.cQx.context = paramContext;
      paramString1.cQx.cQs = 2;
      com.tencent.mm.sdk.b.a.xxA.m(paramString1);
      AppMethodBeat.o(124660);
      i = 0;
      break;
      paramString1 = new Intent();
      paramString1.putExtra("sns_userName", (String)localObject);
      paramString1.addFlags(67108864);
      paramString1.putExtra("sns_adapter_type", 1);
      d.b(paramContext, "sns", ".ui.SnsTimeLineUserPagerUI", paramString1);
      AppMethodBeat.o(124660);
      i = 0;
      break;
      if ((!bo.isNullOrNil(paramString3)) && (!bo.isNullOrNil(paramString2)))
      {
        if (!com.tencent.mm.pluginsdk.permission.b.o(paramContext, "android.permission.READ_CONTACTS"))
        {
          ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no contact permission");
          AppMethodBeat.o(124660);
          i = 1;
          break;
        }
        Toast.makeText(paramContext, paramContext.getString(2131298775), 1).show();
        paramContext.getContentResolver().delete(ContactsContract.Data.CONTENT_URI, "_id = ?", new String[] { paramString2 });
        paramContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI, "contact_id = ? AND account_type = ?", new String[] { paramString3, "com.tencent.mm.account" });
      }
    }
  }

  public final int cy(Context paramContext)
  {
    AppMethodBeat.i(124659);
    com.tencent.mm.kernel.g.RN();
    int i;
    if ((!com.tencent.mm.kernel.a.QX()) || (com.tencent.mm.kernel.a.QT()))
    {
      ab.d("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "not login, start bind login");
      i = 3;
      AppMethodBeat.o(124659);
    }
    while (true)
    {
      return i;
      if (bo.isNullOrNil((String)com.tencent.mm.kernel.g.RP().Ry().get(6, "")))
      {
        ab.d("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "not bind mobile, start bind mobie");
        AppMethodBeat.o(124659);
        i = 2;
      }
      else if (!com.tencent.mm.pluginsdk.permission.b.o(paramContext, "android.permission.READ_CONTACTS"))
      {
        ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no contacts permission");
        AppMethodBeat.o(124659);
        i = 1;
      }
      else if (this.uri != null)
      {
        Cursor localCursor = paramContext.getContentResolver().query(this.uri, new String[] { "contact_id", "_id", "data4" }, null, null, null);
        if (localCursor == null)
        {
          ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "query database err");
          AppMethodBeat.o(124659);
          i = 1;
        }
        else if (!localCursor.moveToFirst())
        {
          ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "query database err, move to first fail");
          localCursor.close();
          AppMethodBeat.o(124659);
          i = 1;
        }
        else
        {
          i = localCursor.getColumnIndex("data4");
          if (i == -1)
          {
            ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no data4 segment exist");
            localCursor.close();
            AppMethodBeat.o(124659);
            i = 1;
          }
          else
          {
            Object localObject1 = "";
            String str1 = "";
            Object localObject2 = str1;
            String str2;
            try
            {
              str2 = localCursor.getString(i);
              localObject2 = str1;
              localObject1 = str2;
              i = localCursor.getColumnIndex("contact_id");
              label306: String str3;
              if (i >= 0)
              {
                localObject2 = str1;
                localObject1 = str2;
                str1 = localCursor.getString(i);
                localObject2 = str1;
                localObject1 = str2;
                i = localCursor.getColumnIndex("_id");
                if (i < 0)
                  break label389;
                localObject2 = str1;
                localObject1 = str2;
                str3 = localCursor.getString(i);
              }
              label389: for (localObject2 = str3; ; localObject2 = "")
              {
                localCursor.close();
                if (!bo.isNullOrNil(str2))
                  break label482;
                ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null friendmobile");
                AppMethodBeat.o(124659);
                i = 1;
                break;
                str1 = "";
                break label306;
              }
            }
            catch (Exception paramContext)
            {
              ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "match error, %s\n%s", new Object[] { paramContext.getMessage(), bo.l(paramContext) });
              ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "result friendMobileMd5 %s contact_id %s data_id %s", new Object[] { localObject1, localObject2, "" });
              localCursor.close();
              AppMethodBeat.o(124659);
              i = 1;
              continue;
            }
            finally
            {
              localCursor.close();
              AppMethodBeat.o(124659);
            }
            label482: i = d(paramContext, str2, (String)localObject2, str1);
            AppMethodBeat.o(124659);
          }
        }
      }
      else if (!bo.isNullOrNil(this.gyD))
      {
        i = d(paramContext, com.tencent.mm.a.g.x(com.tencent.mm.pluginsdk.a.ws(this.gyD).getBytes()), null, null);
        AppMethodBeat.o(124659);
      }
      else
      {
        ab.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "uri is null and the phone num is null");
        AppMethodBeat.o(124659);
        i = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.b.b
 * JD-Core Version:    0.6.2
 */