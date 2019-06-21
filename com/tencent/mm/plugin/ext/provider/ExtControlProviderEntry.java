package com.tencent.mm.plugin.ext.provider;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.ext.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bz;
import com.tencent.mm.storage.ca;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderEntry extends ExtContentProviderBase
{
  private static final UriMatcher lQc;
  private String[] lPN = null;
  private int lPO = -1;
  private boolean lQd = false;
  private Context lQe;

  static
  {
    AppMethodBeat.i(20347);
    UriMatcher localUriMatcher = new UriMatcher(-1);
    lQc = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.entry", "view_profile", 2);
    lQc.addURI("com.tencent.mm.plugin.ext.entry", "to_chatting", 3);
    lQc.addURI("com.tencent.mm.plugin.ext.entry", "to_nearby", 4);
    lQc.addURI("com.tencent.mm.plugin.ext.entry", "sns_comment_detail", 5);
    lQc.addURI("com.tencent.mm.plugin.ext.entry", "share_time_line", 6);
    AppMethodBeat.o(20347);
  }

  public ExtControlProviderEntry()
  {
  }

  public ExtControlProviderEntry(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.lQd = true;
    this.lPN = paramArrayOfString;
    this.lPO = paramInt;
    this.lQe = paramContext;
  }

  private Cursor a(String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(20345);
    ab.i("MicroMsg.ExtControlEntryProvider", "toChattingUI");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      ab.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      dZ(3, 3601);
      paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(3601);
      AppMethodBeat.o(20345);
    }
    while (true)
    {
      return paramArrayOfString;
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.ExtControlEntryProvider", "callSource == null");
        dZ(3, 3602);
        paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(3602);
        AppMethodBeat.o(20345);
      }
      else
      {
        paramArrayOfString = paramArrayOfString[0];
        if ((paramArrayOfString == null) || (paramArrayOfString.length() <= 0))
        {
          ab.w("MicroMsg.ExtControlEntryProvider", "contactId == null");
          dZ(3, 3603);
          paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(3603);
          AppMethodBeat.o(20345);
        }
        else
        {
          int i;
          if ((paramString != null) && (paramString.equalsIgnoreCase("openapi")))
          {
            i = 1;
            label151: if (i == 0)
              break label290;
          }
          try
          {
            paramArrayOfString = b.brB().apZ(paramArrayOfString);
            if ((paramArrayOfString == null) || (bo.isNullOrNil(paramArrayOfString.field_openId)) || (bo.isNullOrNil(paramArrayOfString.field_username)))
            {
              ab.e("MicroMsg.ExtControlEntryProvider", "openidInApp is null");
              dZ(3, 3604);
              paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(3604);
              AppMethodBeat.o(20345);
              continue;
              i = 0;
              break label151;
            }
            aw.ZK();
            for (paramArrayOfString = c.XM().aoO(paramArrayOfString.field_username); ; paramArrayOfString = c.XM().mQ(com.tencent.mm.plugin.ext.a.a.Le(paramArrayOfString)))
            {
              if ((paramArrayOfString != null) && ((int)paramArrayOfString.ewQ > 0) && (this.lQe != null))
                break label355;
              ab.e("MicroMsg.ExtControlEntryProvider", "wrong args ct");
              dZ(3, 3605);
              paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(3605);
              AppMethodBeat.o(20345);
              break;
              label290: aw.ZK();
            }
          }
          catch (Exception paramArrayOfString)
          {
            ab.w("MicroMsg.ExtControlEntryProvider", paramArrayOfString.getMessage());
            ab.printErrStackTrace("MicroMsg.ExtControlEntryProvider", paramArrayOfString, "", new Object[0]);
            T(5, 4, 12);
            paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(12);
            AppMethodBeat.o(20345);
          }
          continue;
          label355: paramString = new Intent();
          paramString.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.chatting.ChattingUI"));
          paramString.putExtra("Chat_User", paramArrayOfString.field_username);
          paramString.putExtra("finish_direct", true);
          paramString.addFlags(268435456);
          paramString.addFlags(67108864);
          this.lQe.startActivity(paramString);
          T(4, 0, 1);
          paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
          AppMethodBeat.o(20345);
        }
      }
    }
  }

  private Cursor t(String[] paramArrayOfString)
  {
    Intent localIntent = null;
    AppMethodBeat.i(20344);
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      ab.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      vf(3);
      AppMethodBeat.o(20344);
      paramArrayOfString = localIntent;
    }
    while (true)
    {
      return paramArrayOfString;
      paramArrayOfString = paramArrayOfString[0];
      if ((paramArrayOfString == null) || (paramArrayOfString.length() <= 0))
      {
        ab.w("MicroMsg.ExtControlEntryProvider", "contactId == null");
        vf(3);
        AppMethodBeat.o(20344);
        paramArrayOfString = localIntent;
      }
      else
      {
        try
        {
          aw.ZK();
          paramArrayOfString = c.XM().mQ(com.tencent.mm.plugin.ext.a.a.Le(paramArrayOfString));
          if ((paramArrayOfString != null) && ((int)paramArrayOfString.ewQ > 0) && (this.lQe != null))
            break label167;
          vf(3);
          AppMethodBeat.o(20344);
          paramArrayOfString = localIntent;
        }
        catch (Exception paramArrayOfString)
        {
          ab.w("MicroMsg.ExtControlEntryProvider", paramArrayOfString.getMessage());
          ab.printErrStackTrace("MicroMsg.ExtControlEntryProvider", paramArrayOfString, "", new Object[0]);
          vf(3);
          AppMethodBeat.o(20344);
          paramArrayOfString = localIntent;
        }
        continue;
        label167: localIntent = new Intent();
        localIntent.addFlags(268435456);
        localIntent.putExtra("Contact_User", paramArrayOfString.field_username);
        d.b(this.lQe, "profile", ".ui.ContactInfoUI", localIntent);
        vf(0);
        paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
        AppMethodBeat.o(20344);
      }
    }
  }

  private Cursor u(String[] paramArrayOfString)
  {
    Object localObject = null;
    AppMethodBeat.i(20346);
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      ab.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      vf(3);
      AppMethodBeat.o(20346);
      paramArrayOfString = localObject;
    }
    while (true)
    {
      return paramArrayOfString;
      paramArrayOfString = paramArrayOfString[0];
      if ((paramArrayOfString == null) || (paramArrayOfString.length() <= 0))
      {
        ab.w("MicroMsg.ExtControlEntryProvider", "wrong args");
        vf(3);
        AppMethodBeat.o(20346);
        paramArrayOfString = localObject;
      }
      else
      {
        long l;
        try
        {
          l = com.tencent.mm.plugin.ext.a.a.Le(paramArrayOfString);
          if (l > 0L)
            break label142;
          vf(3);
          AppMethodBeat.o(20346);
          paramArrayOfString = localObject;
        }
        catch (Exception paramArrayOfString)
        {
          ab.w("MicroMsg.ExtControlEntryProvider", paramArrayOfString.getMessage());
          ab.printErrStackTrace("MicroMsg.ExtControlEntryProvider", paramArrayOfString, "", new Object[0]);
          vf(3);
          AppMethodBeat.o(20346);
          paramArrayOfString = localObject;
        }
        continue;
        label142: if (this.lQe == null)
        {
          vf(4);
          AppMethodBeat.o(20346);
          paramArrayOfString = localObject;
        }
        else
        {
          paramArrayOfString = new Intent();
          paramArrayOfString.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"));
          paramArrayOfString.putExtra("INTENT_SNS_LOCAL_ID", (int)l);
          paramArrayOfString.addCategory("android.intent.category.DEFAULT");
          paramArrayOfString.addFlags(268435456);
          this.lQe.startActivity(paramArrayOfString);
          vf(0);
          paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
          AppMethodBeat.o(20346);
        }
      }
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramArrayOfString1 = null;
    AppMethodBeat.i(20343);
    ab.i("MicroMsg.ExtControlEntryProvider", "ExtControlProviderEntry query() mIsLocalUsed :" + this.lQd);
    if (this.lQd)
    {
      a(paramUri, this.lQe, this.lPO, this.lPN);
      if (bo.isNullOrNil(this.lPW))
      {
        ab.e("MicroMsg.ExtControlEntryProvider", "AppID == null");
        dZ(3, 7);
        paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(7);
        AppMethodBeat.o(20343);
      }
    }
    while (true)
    {
      return paramUri;
      if (bo.isNullOrNil(brL()))
      {
        ab.e("MicroMsg.ExtControlEntryProvider", "PkgName == null");
        dZ(3, 6);
        paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(6);
        AppMethodBeat.o(20343);
      }
      else
      {
        int i = brM();
        if (i != 1)
        {
          ab.e("MicroMsg.ExtControlEntryProvider", "invalid appid ! return code = ".concat(String.valueOf(i)));
          dZ(2, i);
          paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(i);
          AppMethodBeat.o(20343);
          continue;
          this.lQe = getContext();
          a(paramUri, this.lQe, lQc);
          if (paramUri == null)
          {
            vf(3);
            AppMethodBeat.o(20343);
            paramUri = paramArrayOfString1;
          }
          else if ((bo.isNullOrNil(this.lPW)) || (bo.isNullOrNil(brL())))
          {
            vf(3);
            paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(3);
            AppMethodBeat.o(20343);
          }
          else if (!aVl())
          {
            vf(1);
            paramUri = this.jDN;
            AppMethodBeat.o(20343);
          }
          else if (!dJ(this.lQe))
          {
            ab.w("MicroMsg.ExtControlEntryProvider", "invalid appid ! return null");
            vf(2);
            AppMethodBeat.o(20343);
            paramUri = paramArrayOfString1;
          }
        }
        else
        {
          paramString1 = bo.nullAsNil(paramUri.getQueryParameter("source"));
          if (!this.lQd)
            this.lPO = lQc.match(paramUri);
          switch (this.lPO)
          {
          default:
            dZ(3, 15);
            AppMethodBeat.o(20343);
            paramUri = paramArrayOfString1;
            break;
          case 2:
            paramUri = t(paramArrayOfString2);
            AppMethodBeat.o(20343);
            break;
          case 3:
            paramUri = a(paramArrayOfString2, paramString1);
            AppMethodBeat.o(20343);
            break;
          case 4:
            if (this.lQe == null)
            {
              vf(4);
              AppMethodBeat.o(20343);
              paramUri = paramArrayOfString1;
            }
            else
            {
              paramUri = new Intent();
              paramUri.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI"));
              paramUri.addFlags(268435456);
              this.lQe.startActivity(paramUri);
              vf(0);
              paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
              AppMethodBeat.o(20343);
            }
            break;
          case 5:
            paramUri = u(paramArrayOfString2);
            AppMethodBeat.o(20343);
            break;
          case 6:
            if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0))
            {
              ab.w("MicroMsg.ExtControlEntryProvider", "wrong args");
              vf(3);
              AppMethodBeat.o(20343);
              paramUri = paramArrayOfString1;
            }
            else
            {
              if (this.lQe != null)
                break label598;
              vf(4);
              AppMethodBeat.o(20343);
              paramUri = paramArrayOfString1;
            }
            break;
          }
        }
      }
    }
    label598: paramArrayOfString1 = new Intent();
    paramArrayOfString1.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
    paramArrayOfString1.setAction("android.intent.action.SEND");
    paramArrayOfString1.addCategory("android.intent.category.DEFAULT");
    paramArrayOfString1.addFlags(268435456);
    if (paramArrayOfString2[1] == null);
    for (paramUri = ""; ; paramUri = paramArrayOfString2[1])
    {
      paramArrayOfString1.putExtra("android.intent.extra.TEXT", paramUri);
      if ((paramArrayOfString2[0] != null) && (paramArrayOfString2[0].trim().length() > 0))
        paramArrayOfString1.putExtra("android.intent.extra.STREAM", Uri.parse(paramArrayOfString2[0]));
      paramArrayOfString1.putExtra("Ksnsupload_empty_img", true);
      paramArrayOfString1.setType("image/*");
      this.lQe.startActivity(paramArrayOfString1);
      vf(0);
      paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
      AppMethodBeat.o(20343);
      break;
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderEntry
 * JD-Core Version:    0.6.2
 */