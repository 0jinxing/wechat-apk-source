package com.tencent.mm.plugin.favorite.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.vfs.e;

@a(7)
public class FavOpenApiEntry extends MMActivity
{
  private String appId;
  private Intent cEp;
  private ap che;
  private Bundle mqu;
  private SendMessageToWX.Req mqv;
  private String mqw;
  private int mqx;
  private String source;

  public FavOpenApiEntry()
  {
    AppMethodBeat.i(20542);
    this.mqx = 0;
    this.che = new ap(new FavOpenApiEntry.1(this), true);
    AppMethodBeat.o(20542);
  }

  private void J(com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(20547);
    abl localabl = new abl();
    localabl.alJ(this.appId);
    localabl.LN(4);
    localabl.alD(r.Yz());
    localabl.alE(r.Yz());
    paramg.field_fromUser = localabl.cEV;
    paramg.field_toUser = localabl.toUser;
    paramg.field_favProto.a(localabl);
    AppMethodBeat.o(20547);
  }

  private q.a a(WXMediaMessage paramWXMediaMessage)
  {
    AppMethodBeat.i(20550);
    paramWXMediaMessage = new FavOpenApiEntry.2(this, paramWXMediaMessage);
    AppMethodBeat.o(20550);
    return paramWXMediaMessage;
  }

  private static aar a(WXMediaMessage paramWXMediaMessage, String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(20548);
    aar localaar = new aar();
    localaar.akH(paramWXMediaMessage.title);
    localaar.akI(paramWXMediaMessage.description);
    localaar.LE(paramInt);
    if (paramString != null)
    {
      localaar.akV(paramString);
      localaar.akR(e.cv(paramString));
      a(paramWXMediaMessage, localaar, paramInt);
      AppMethodBeat.o(20548);
      return localaar;
    }
    String str = com.tencent.mm.a.g.x(paramArrayOfByte);
    if (paramArrayOfByte.length >= 256)
      localaar.akT(str);
    while (true)
    {
      localaar.akS(str);
      localaar.mf(paramArrayOfByte.length);
      localaar.akU(b.cf(localaar.toString(), paramInt));
      e.a(b.b(localaar), paramArrayOfByte, paramArrayOfByte.length);
      break;
      paramString = new byte[256];
      System.arraycopy(paramArrayOfByte, 0, paramString, 0, 256);
      localaar.akT(com.tencent.mm.a.g.x(paramString));
    }
  }

  private static void a(WXMediaMessage paramWXMediaMessage, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(20546);
    paramg.field_sourceType = 4;
    paramg.field_favProto.alB(paramWXMediaMessage.title);
    paramg.field_favProto.alC(paramWXMediaMessage.description);
    AppMethodBeat.o(20546);
  }

  private static void a(WXMediaMessage paramWXMediaMessage, aar paramaar, int paramInt)
  {
    AppMethodBeat.i(20549);
    Object localObject;
    if (paramWXMediaMessage.thumbData != null)
    {
      localObject = com.tencent.mm.a.g.x(paramWXMediaMessage.thumbData);
      paramaar.akX((String)localObject);
      if (paramWXMediaMessage.thumbData.length >= 256)
      {
        paramaar.akY((String)localObject);
        if (bo.isNullOrNil(paramaar.mnd))
          paramaar.akU(b.cf(paramaar.toString(), paramInt));
        paramaar.mg(paramWXMediaMessage.thumbData.length);
        paramaar = b.c(paramaar);
        paramWXMediaMessage = paramWXMediaMessage.thumbData;
        e.a(paramaar, paramWXMediaMessage, paramWXMediaMessage.length);
        AppMethodBeat.o(20549);
      }
    }
    while (true)
    {
      return;
      localObject = new byte[256];
      System.arraycopy(paramWXMediaMessage.thumbData, 0, localObject, 0, 256);
      paramaar.akY(com.tencent.mm.a.g.x((byte[])localObject));
      break;
      paramaar.oY(true);
      AppMethodBeat.o(20549);
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20543);
    super.onCreate(paramBundle);
    if (this.cEp == null)
      this.cEp = getIntent();
    this.mqu = this.cEp.getExtras();
    this.appId = this.mqu.getString("SendAppMessageWrapper_AppId");
    if (this.appId == null)
      this.appId = Uri.parse(this.mqu.getString("_mmessage_content")).getQueryParameter("appid");
    this.mqv = new SendMessageToWX.Req(this.mqu);
    if (this.mqv.scene != 2)
    {
      ab.e("MicroMsg.FavOpenApiEntry", "scene not WXSceneFavorite!");
      finish();
      AppMethodBeat.o(20543);
    }
    while (true)
    {
      return;
      this.mqw = getString(2131299589);
      this.source = getString(2131298424, new Object[] { b.getAppName(this, this.appId) });
      this.che.ae(100L, 100L);
      AppMethodBeat.o(20543);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(20544);
    super.onNewIntent(paramIntent);
    this.cEp = paramIntent;
    AppMethodBeat.o(20544);
  }

  public void onPause()
  {
    AppMethodBeat.i(20551);
    super.onPause();
    AppMethodBeat.o(20551);
  }

  public void onResume()
  {
    AppMethodBeat.i(20545);
    super.onResume();
    AppMethodBeat.o(20545);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry
 * JD-Core Version:    0.6.2
 */