package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.aj.i;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.ct;
import com.tencent.mm.g.a.ct.a;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.a.ok;
import com.tencent.mm.g.a.ok.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.cb;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.chat.l.a;
import com.tencent.mm.pluginsdk.ui.chat.l.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI;
import com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.3;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.aa;
import com.tencent.mm.ui.chatting.c.x;
import com.tencent.mm.ui.chatting.s.a;
import com.tencent.mm.ui.chatting.s.b;
import com.tencent.mm.ui.chatting.s.c;
import com.tencent.mm.ui.chatting.s.d;
import com.tencent.mm.ui.chatting.s.e;
import com.tencent.mm.ui.chatting.s.h;
import com.tencent.mm.ui.chatting.s.k;
import com.tencent.mm.ui.chatting.s.n;
import com.tencent.mm.ui.chatting.s.p;
import com.tencent.mm.ui.chatting.view.AvatarImageView;
import com.tencent.mm.ui.widget.textview.a.f;
import java.util.Map;

public abstract class c
{
  private static long yUK = 0L;
  private static boolean zbg = false;
  protected boolean kuU;
  public boolean yFW;
  private c.c zbh;
  private a.f zbi;
  private c.d zbj;
  private boolean zbk = false;
  protected s.b zbl;
  protected s.d zbm;
  protected s.c zbn;
  protected s.p zbo;
  protected s.h zbp;
  protected s.k zbq;
  protected s.e zbr;
  private final long zbs = 120000L;

  public static String a(bi parambi, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str1 = null;
    String str2 = null;
    if (parambi == null);
    while (true)
    {
      return str2;
      if (parambi.field_isSend != 1)
        break;
      str2 = r.Yz();
    }
    if (paramBoolean1)
      str1 = bf.oy(parambi.field_content);
    while (true)
    {
      str2 = str1;
      if (!bo.isNullOrNil(str1))
        break;
      str2 = parambi.field_talker;
      break;
      if (paramBoolean2)
        str1 = parambi.field_bizChatUserId;
    }
  }

  public static void a(bi parambi, EmojiInfo paramEmojiInfo)
  {
    ct localct = new ct();
    localct.cvU.cvV = paramEmojiInfo;
    paramEmojiInfo = localct.cvU.cvV;
    if (parambi != null);
    for (parambi = parambi.field_talker; ; parambi = null)
    {
      paramEmojiInfo.talker = parambi;
      localct.cvU.scene = 0;
      com.tencent.mm.sdk.b.a.xxA.m(localct);
      return;
    }
  }

  protected static void a(com.tencent.mm.ui.chatting.d.a parama, View paramView, bi parambi, j.b paramb, String paramString, long paramLong)
  {
    if (!com.tencent.mm.pluginsdk.model.app.g.aiF(paramb.appId))
    {
      paramView.setTag(new l.b());
      return;
    }
    if (parama.dFx());
    for (int i = 2; ; i = 1)
    {
      l.a locala = new l.a();
      locala.appId = paramb.appId;
      locala.cKf = "message";
      locala.ceO = paramString;
      locala.cKE = d(parama, parambi);
      locala.voz = paramb.type;
      locala.scene = i;
      locala.voA = paramb.mediaTagName;
      locala.cKK = paramLong;
      locala.voB = parama.getTalkerUserName();
      a(parama, paramView, locala);
      break;
    }
  }

  private static void a(com.tencent.mm.ui.chatting.d.a parama, View paramView, Object paramObject)
  {
    paramView.setTag(paramObject);
    paramView.setOnClickListener(((com.tencent.mm.ui.chatting.c.b.h)parama.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dDb());
  }

  protected static void a(com.tencent.mm.ui.chatting.d.a parama, View paramView, String paramString)
  {
    if (!com.tencent.mm.pluginsdk.model.app.g.aiF(paramString))
      paramView.setTag(new l.b());
    while (true)
    {
      return;
      l.b localb = new l.b();
      localb.appId = paramString;
      localb.cKf = "message";
      a(parama, paramView, localb);
    }
  }

  private static void a(com.tencent.mm.ui.chatting.d.a parama, ImageView paramImageView, Bitmap paramBitmap)
  {
    paramBitmap = new BitmapDrawable(paramBitmap);
    int i = (int)parama.yTx.getMMResources().getDimension(2131427866);
    paramBitmap.setBounds(0, 0, i, i);
    paramImageView.setImageDrawable(paramBitmap);
  }

  protected static void a(com.tencent.mm.ui.chatting.d.a parama, ImageView paramImageView, String paramString)
  {
    paramString = com.tencent.mm.pluginsdk.model.app.g.b(paramString, 2, com.tencent.mm.bz.a.getDensity(parama.yTx.getContext()));
    if ((paramString != null) && (!paramString.isRecycled()))
      a(parama, paramImageView, paramString);
    while (true)
    {
      return;
      a(parama, paramImageView, BitmapFactory.decodeResource(parama.yTx.getMMResources(), 2130839710));
    }
  }

  private static void a(com.tencent.mm.ui.chatting.d.a parama, TextView paramTextView, Bitmap paramBitmap)
  {
    paramBitmap = new BitmapDrawable(paramBitmap);
    int i = (int)parama.yTx.getMMResources().getDimension(2131427866);
    paramBitmap.setBounds(0, 0, i, i);
    paramTextView.setCompoundDrawables(paramBitmap, null, null, null);
  }

  protected static void a(com.tencent.mm.ui.chatting.d.a parama, TextView paramTextView, String paramString)
  {
    paramString = com.tencent.mm.pluginsdk.model.app.g.b(paramString, 2, com.tencent.mm.bz.a.getDensity(parama.yTx.getContext()));
    if ((paramString != null) && (!paramString.isRecycled()))
      a(parama, paramTextView, paramString);
    while (true)
    {
      return;
      a(parama, paramTextView, BitmapFactory.decodeResource(parama.yTx.getMMResources(), 2130839710));
    }
  }

  public static void a(com.tencent.mm.ui.chatting.d.a parama, j.b paramb, String paramString1, com.tencent.mm.pluginsdk.model.app.f paramf, long paramLong, int paramInt, String paramString2)
  {
    int i;
    int j;
    label53: label64: ok localok;
    ok.a locala;
    if (parama.dFx())
    {
      i = 2;
      j = paramInt;
      if (paramInt == -1)
      {
        if (paramb.type != 7)
          break label226;
        if ((paramf == null) || (!p.u(parama.yTx.getContext(), paramf.field_packageName)))
          break label219;
        j = 0;
      }
      if (paramb.type != 2)
        break label232;
      j = 4;
      localok = new ok();
      localok.cKI.context = parama.yTx.getContext();
      localok.cKI.scene = i;
      localok.cKI.csB = paramb.appId;
      locala = localok.cKI;
      if (paramf != null)
        break label246;
    }
    label219: label226: label232: label246: for (parama = null; ; parama = paramf.field_packageName)
    {
      locala.packageName = parama;
      localok.cKI.msgType = paramb.type;
      localok.cKI.cEV = paramString1;
      localok.cKI.cKJ = j;
      localok.cKI.mediaTagName = paramb.mediaTagName;
      localok.cKI.cKK = paramLong;
      localok.cKI.cKL = "";
      localok.cKI.cst = paramString2;
      com.tencent.mm.sdk.b.a.xxA.m(localok);
      return;
      i = 1;
      break;
      j = 6;
      break label53;
      j = 3;
      break label53;
      if (paramb.type != 5)
        break label64;
      j = 1;
      break label64;
    }
  }

  public static void a(com.tencent.mm.ui.chatting.d.a parama, j.b paramb, String paramString1, com.tencent.mm.pluginsdk.model.app.f paramf, long paramLong, String paramString2)
  {
    a(parama, paramb, paramString1, paramf, paramLong, -1, paramString2);
  }

  private void a(c.a parama, com.tencent.mm.ui.chatting.d.a parama1, bi parambi)
  {
    if (this.zbk);
    do
    {
      return;
      this.zbk = true;
    }
    while ((parama1.yTx instanceof AppBrandServiceChattingUI.AppBrandServiceChattingFmUI));
    if ((parambi != null) && (!bo.isNullOrNil(parambi.dJD)))
      this.zbl = new s.a(parama1);
    while (true)
    {
      parama.zbv.setOnClickListener(this.zbl);
      parama.zbv.setOnLongClickListener(this.zbm);
      break;
      this.zbl = new s.b(parama1);
      this.zbm = new s.d(parama1);
    }
  }

  protected static void a(c.a parama, CharSequence paramCharSequence)
  {
    if ((parama == null) || (parama.qkY == null));
    while (true)
    {
      return;
      if (paramCharSequence == null)
      {
        parama.qkY.setVisibility(8);
      }
      else
      {
        parama.qkY.setText(paramCharSequence);
        parama.qkY.setVisibility(0);
      }
    }
  }

  protected static boolean a(bi parambi, com.tencent.mm.ui.chatting.d.a parama)
  {
    boolean bool1 = false;
    long l = parambi.field_createTime;
    int i;
    boolean bool2;
    if (cb.aaE() - l > 120000L)
    {
      i = 1;
      if (i == 0)
        break label39;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      i = 0;
      break;
      label39: if ((parama != null) && (parama.getTalkerUserName().equals(parama.dFu())))
      {
        bool2 = bool1;
        if (parambi.field_status == 2);
      }
      else
      {
        i = com.tencent.mm.m.g.Nu().getInt("ShowRevokeMsgEntry", 1);
        ab.d("MicroMsg.ChattingItem", "[oneliang][isRevokeMsgEnable] enable:%d", new Object[] { Integer.valueOf(i) });
        bool2 = bool1;
        if (1 == i)
          bool2 = true;
      }
    }
  }

  protected static boolean a(com.tencent.mm.ui.chatting.c.b.h paramh, long paramLong)
  {
    if ((paramLong > 0L) && (paramh.dDd() == paramLong));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected static boolean a(com.tencent.mm.ui.chatting.d.a parama, com.tencent.mm.pluginsdk.model.app.f paramf)
  {
    boolean bool1 = true;
    com.tencent.mm.plugin.game.a.a locala = com.tencent.mm.plugin.game.a.a.a.bDb();
    if ((!com.tencent.mm.pluginsdk.model.app.g.a(parama.yTx.getContext(), paramf)) && (locala != null))
      if (!bo.isNullOrNil(paramf.dng))
      {
        boolean bool2 = com.tencent.mm.pluginsdk.model.app.q.by(parama.yTx.getContext(), paramf.dng);
        ab.i("MicroMsg.ChattingItem", "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]", new Object[] { paramf.dng, Boolean.valueOf(bool2) });
        if (!bool2);
      }
    while (true)
    {
      return bool1;
      if (parama.dFx());
      for (int i = 2; ; i = 1)
      {
        gt localgt = new gt();
        localgt.cBv.actionCode = 2;
        localgt.cBv.scene = i;
        localgt.cBv.appId = paramf.field_appId;
        localgt.cBv.context = parama.yTx.getContext();
        com.tencent.mm.sdk.b.a.xxA.m(localgt);
        parama.yTx.getContext();
        locala.W(paramf.field_appId, i, i);
        break;
      }
      bool1 = false;
    }
  }

  protected static boolean arB(String paramString)
  {
    if (((!t.nl(paramString)) && (!t.nB(paramString)) && (!t.mZ(paramString)) && (!t.nJ(paramString))) || (t.kH(paramString)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected static void b(com.tencent.mm.ui.chatting.d.a parama, j.b paramb, bi parambi)
  {
    com.tencent.mm.plugin.game.a.a locala = com.tencent.mm.plugin.game.a.a.a.bDb();
    if (locala != null)
      if (!parama.dFx())
        break label64;
    label64: for (int i = 2; ; i = 1)
    {
      String str = d(parama, parambi);
      parama.yTx.getContext();
      locala.a(paramb.appId, str, paramb.type, i, paramb.mediaTagName, parambi.field_msgSvrId, parama.getTalkerUserName());
      return;
    }
  }

  protected static String c(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    parambi = parambi.field_talker;
    parama = (com.tencent.mm.ui.chatting.c.b.d)parama.aF(com.tencent.mm.ui.chatting.c.b.d.class);
    if ((parama.dDm()) && (parama.dDk() != null));
    for (parama = parama.dDk().field_bizChatServId; ; parama = parambi)
      return parama;
  }

  protected static void c(com.tencent.mm.ui.chatting.d.a parama, View paramView, Object paramObject)
  {
    paramView.setTag(paramObject);
    paramView.setOnClickListener(((com.tencent.mm.ui.chatting.c.b.h)parama.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dDc());
  }

  public static String d(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    String str = parama.getTalkerUserName();
    parama = str;
    if (t.kH(str))
      parama = bf.oy(parambi.field_content);
    return parama;
  }

  protected static boolean dHm()
  {
    boolean bool = true;
    String str = com.tencent.mm.m.g.Nu().getValue("ShowSendOK");
    int i;
    if (bo.isNullOrNil(str))
    {
      i = 0;
      if (1 != i)
        break label36;
    }
    while (true)
    {
      return bool;
      i = bo.ank(str);
      break;
      label36: bool = false;
    }
  }

  protected static boolean dg(String paramString)
  {
    return com.tencent.mm.pluginsdk.model.app.g.dg(paramString);
  }

  private s.c g(com.tencent.mm.ui.chatting.d.a parama)
  {
    if (this.zbn == null)
      this.zbn = new s.c(parama);
    return this.zbn;
  }

  protected static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    Object localObject = null;
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = null;
      if (paramString != null)
        break label46;
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramString = com.tencent.mm.pluginsdk.model.app.g.bT(paramString, true);
      if (paramString == null)
      {
        paramString = null;
        break;
      }
      paramString = paramString.field_packageName;
      break;
      try
      {
        label46: paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.ChattingItem", paramContext, "", new Object[0]);
        paramContext = localObject;
      }
    }
  }

  public static int hU(Context paramContext)
  {
    float f = com.tencent.mm.bz.a.dm(paramContext);
    int i;
    if (f == 0.875F)
      i = com.tencent.mm.bz.a.am(paramContext, 2131428223);
    while (true)
    {
      return i;
      if (f == 1.125F)
        i = com.tencent.mm.bz.a.am(paramContext, 2131428216);
      else if (f == 1.25F)
        i = com.tencent.mm.bz.a.am(paramContext, 2131428224);
      else if (f == 1.375F)
        i = com.tencent.mm.bz.a.am(paramContext, 2131428206);
      else if ((f == 1.625F) || (f == 1.875F) || (f == 2.025F))
        i = com.tencent.mm.bz.a.am(paramContext, 2131428207);
      else
        i = com.tencent.mm.bz.a.am(paramContext, 2131428222);
    }
  }

  public static int hV(Context paramContext)
  {
    float f = com.tencent.mm.bz.a.dm(paramContext);
    int i;
    if ((f != 0.875F) && (f != 1.125F))
      if (f == 1.25F)
        i = com.tencent.mm.bz.a.am(paramContext, 2131428205);
    while (true)
    {
      return i;
      if (f == 1.375F)
        i = com.tencent.mm.bz.a.am(paramContext, 2131428203);
      else if ((f == 1.625F) || (f == 1.875F) || (f == 2.025F))
        i = com.tencent.mm.bz.a.am(paramContext, 2131428207);
      else
        i = com.tencent.mm.bz.a.am(paramContext, 2131428204);
    }
  }

  public static void v(ImageView paramImageView, String paramString)
  {
    if (bo.isNullOrNil(paramString))
      paramImageView.setImageResource(2130838444);
    while (true)
    {
      return;
      com.tencent.mm.pluginsdk.ui.a.b.b(paramImageView, paramString);
    }
  }

  public static void w(ImageView paramImageView, String paramString)
  {
    if (bo.isNullOrNil(paramString))
      paramImageView.setImageResource(2130837985);
    while (true)
    {
      return;
      com.tencent.mm.pluginsdk.ui.a.b.r(paramImageView, paramString);
    }
  }

  public abstract View a(LayoutInflater paramLayoutInflater, View paramView);

  protected final a.f a(c.c paramc)
  {
    if (this.zbi == null)
      this.zbi = new c.e(paramc);
    return this.zbi;
  }

  protected final void a(int paramInt, c.a parama, bi parambi, String paramString, boolean paramBoolean, com.tencent.mm.ui.chatting.d.a parama1, s.n paramn)
  {
    if (parambi.field_isSend == 1)
    {
      parama.zby.setTag(new ay(parambi, paramBoolean, paramInt, paramString, '\000'));
      paramString = parama.zby;
      if (this.zbr == null)
        this.zbr = new c.1(this, parama1, paramn);
      paramString.setOnClickListener(this.zbr);
      switch (parambi.field_status)
      {
      default:
        ab.e("MicroMsg.ChattingItem", "getMsgStateResId: not found this state");
        paramInt = -1;
        if (paramInt != -1)
        {
          parama.zby.setImageResource(2130840327);
          parama.zby.setVisibility(0);
          parama.zby.setContentDescription(ah.getContext().getString(2131301505));
          if (parama.pyf != null)
            parama.pyf.setVisibility(8);
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    }
    while (true)
    {
      return;
      paramInt = -1;
      break;
      paramInt = 2130840327;
      break;
      parama.zby.setVisibility(8);
    }
  }

  protected final void a(com.tencent.mm.ui.chatting.d.a parama, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, boolean paramBoolean, long paramLong1, long paramLong2, bi parambi)
  {
    if (((paramString1 == null) || (paramString1.length() == 0)) && ((paramString2 == null) || (paramString2.length() == 0)))
    {
      ab.e("MicroMsg.ChattingItem", "url, lowUrl both are empty");
      return;
    }
    String str;
    if (at.isMobile(parama.yTx.getContext()))
    {
      str = paramString1;
      if (paramString2 != null)
      {
        if (paramString2.length() > 0)
          break label312;
        str = paramString1;
      }
    }
    while (true)
    {
      paramString1 = new Intent();
      paramString1.putExtra("msg_id", paramLong1);
      paramString1.putExtra("rawUrl", str);
      paramString1.putExtra("version_name", paramString3);
      paramString1.putExtra("version_code", paramInt);
      paramString1.putExtra("usePlugin", paramBoolean);
      paramString1.putExtra("geta8key_username", parama.getTalkerUserName());
      paramString1.putExtra("KPublisherId", "msg_" + Long.toString(paramLong2));
      paramString1.putExtra("KAppId", paramString4);
      paramString1.putExtra("pre_username", b(parama, parambi));
      paramString1.putExtra("prePublishId", "msg_" + Long.toString(paramLong2));
      if (parambi != null)
        paramString1.putExtra("preUsername", b(parama, parambi));
      paramString1.putExtra("preChatName", parama.getTalkerUserName());
      paramString1.putExtra("preChatTYPE", u.ad(b(parama, parambi), parama.getTalkerUserName()));
      paramString1.putExtra("preMsgIndex", 0);
      com.tencent.mm.bp.d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramString1);
      break;
      if (paramString1 != null)
      {
        str = paramString1;
        if (paramString1.length() > 0);
      }
      else
      {
        label312: str = paramString2;
      }
    }
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi)
  {
    long l1 = yUK;
    long l2 = System.currentTimeMillis();
    yUK = l2;
    if (l1 + 30000L < l2)
    {
      aw.ZK();
      zbg = com.tencent.mm.model.c.isSDCardAvailable();
    }
    this.kuU = zbg;
    String str = null;
    if (dHj())
    {
      str = b(parama1, parambi);
      a(parama, parama1, parambi, str);
      a(parama, parama1, str, parambi);
    }
    a(parama, paramInt, parama1, parambi, str);
  }

  public abstract void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString);

  protected void a(c.a parama, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    if ((paramString == null) || (parama.qkY == null) || (parambi == null))
      return;
    String str;
    if ((parambi.field_isSend == 0) && (!bo.isNullOrNil(parambi.dJD)))
    {
      com.tencent.mm.aj.g localg = z.aeQ().rg(parambi.dJD);
      int i = 1;
      if ((localg != null) && (!bo.isNullOrNil(localg.field_openId)) && (!bo.isNullOrNil(localg.field_nickname)))
      {
        str = localg.field_nickname;
        i = 0;
        label86: if (i == 0)
        {
          paramString = str;
          if (!i.a(localg));
        }
        else
        {
          z.aeS().a(new c.b(parama1, parambi.dJD));
          z.aeS().ay(parama1.getTalkerUserName(), parambi.dJD);
          paramString = str;
        }
      }
    }
    while (true)
    {
      a(parama, paramString);
      break;
      ab.i("MicroMsg.ChattingItem", "fillingUsername:need getKfInfo");
      str = null;
      break label86;
      if ((b(parama1)) && (((com.tencent.mm.ui.chatting.c.b.f)parama1.aF(com.tencent.mm.ui.chatting.c.b.f.class)).dDE()))
      {
        if (((com.tencent.mm.ui.chatting.c.b.d)parama1.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDn())
        {
          parambi = ((com.tencent.mm.ui.chatting.c.b.f)parama1.aF(com.tencent.mm.ui.chatting.c.b.f.class)).arj(parambi.field_bizChatUserId);
          paramString = j.b(parama1.yTx.getContext(), parambi, parama.qkY.getTextSize());
        }
        else
        {
          parambi = ((com.tencent.mm.ui.chatting.c.b.f)parama1.aF(com.tencent.mm.ui.chatting.c.b.f.class)).arj(paramString);
          paramString = j.b(parama1.yTx.getContext(), parambi, parama.qkY.getTextSize());
        }
      }
      else
        paramString = null;
    }
  }

  protected final void a(c.a parama, com.tencent.mm.ui.chatting.d.a parama1, String paramString, bi parambi)
  {
    Object localObject = null;
    if (parama.zbv == null);
    while (true)
    {
      return;
      if ((t.nI(paramString)) && (!paramString.equals(t.fkY[0])))
      {
        parama.zbv.setVisibility(8);
      }
      else if ((parambi != null) && (!bo.isNullOrNil(parambi.dJD)))
      {
        if (parama1.dFx())
        {
          localObject = parama1.getTalkerUserName();
          label71: localObject = new ay(paramString, (String)localObject);
          ((ay)localObject).ziw = parambi.dJD;
          com.tencent.mm.pluginsdk.ui.a.b.f(parama.zbv, parambi.dJD, 2130837919);
          label108: parama.zbv.setVisibility(0);
          parama.zbv.setTag(localObject);
          a(parama, parama1, parambi);
          if (!dHk())
          {
            ((x)parama1.aF(x.class)).a(parama.zbv);
            parama.zbv.setOnDoubleClickListener(g(parama1));
          }
          com.tencent.mm.ui.chatting.q.eJ(parama.zbv);
          parama.zbv.setContentDescription(com.tencent.mm.model.s.mJ(paramString) + parama1.yTx.getContext().getString(2131297186));
          parama.zbv.dk(paramString, 5);
          if (parama.zbw == null)
            continue;
          if ((parambi == null) || (parambi.dqJ == null) || (!parambi.dqJ.contains("watch_msg_source_type")))
            break label562;
          parama1 = (String)br.z(parambi.dqJ, "msgsource").get(".msgsource.watch_msg_source_type");
        }
      }
      else
      {
        try
        {
          i = Integer.valueOf(parama1).intValue();
          if ((i > 0) && (i <= 4))
          {
            parama.zbw.setVisibility(0);
            continue;
            localObject = null;
            break label71;
            if ((parambi != null) && (((com.tencent.mm.ui.chatting.c.b.d)parama1.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm()))
            {
              localObject = new ay(parambi.field_bizChatUserId, null);
              com.tencent.mm.ui.chatting.c.b.d locald = (com.tencent.mm.ui.chatting.c.b.d)parama1.aF(com.tencent.mm.ui.chatting.c.b.d.class);
              o.ahp().a(locald.ru(parambi.field_bizChatUserId), parama.zbv, ((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dDe());
              break label108;
            }
            if ((parambi != null) && (parambi.field_isSend == 0) && (parama1.aF(com.tencent.mm.ui.chatting.c.b.a.class) != null) && (!bo.isNullOrNil(((com.tencent.mm.ui.chatting.c.b.a)parama1.aF(com.tencent.mm.ui.chatting.c.b.a.class)).dFr())))
            {
              localObject = new ay(paramString, null);
              o.ahp().a(((com.tencent.mm.ui.chatting.c.b.a)parama1.aF(com.tencent.mm.ui.chatting.c.b.a.class)).dFr(), parama.zbv, ((com.tencent.mm.ui.chatting.c.b.h)parama1.aF(com.tencent.mm.ui.chatting.c.b.h.class)).dDe());
              break label108;
            }
            if (parama1.dFx())
              localObject = parama1.getTalkerUserName();
            localObject = new ay(paramString, (String)localObject);
            v(parama.zbv, paramString);
          }
        }
        catch (Exception parama1)
        {
          while (true)
            int i = 0;
          parama.zbw.setVisibility(8);
        }
        continue;
        label562: parama.zbw.setVisibility(8);
      }
    }
  }

  public abstract boolean a(ContextMenu paramContextMenu, View paramView, bi parambi);

  public abstract boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi);

  public final boolean a(com.tencent.mm.ui.chatting.d.a parama, j.b paramb, bi parambi)
  {
    boolean bool = false;
    if (bo.isNullOrNil(paramb.fiG))
      return bool;
    com.tencent.mm.ui.chatting.a.a(com.tencent.mm.ui.chatting.a.a.yFu, parambi, paramb.fiN, paramb.fiM);
    String str = parambi.field_imgPath;
    Intent localIntent = new Intent();
    localIntent.putExtra("IsAd", false);
    localIntent.putExtra("KStremVideoUrl", paramb.fiG);
    localIntent.putExtra("KThumUrl", paramb.fiL);
    localIntent.putExtra("KThumbPath", str);
    localIntent.putExtra("KSta_StremVideoAduxInfo", paramb.fiM);
    localIntent.putExtra("KSta_StremVideoPublishId", paramb.fiN);
    localIntent.putExtra("KSta_SourceType", 2);
    if (parama.dFx());
    for (int i = com.tencent.mm.ui.chatting.a.b.yFD.value; ; i = com.tencent.mm.ui.chatting.a.b.yFC.value)
    {
      localIntent.putExtra("KSta_Scene", i);
      localIntent.putExtra("KSta_FromUserName", b(parama, parambi));
      localIntent.putExtra("KSta_ChatName", parama.getTalkerUserName());
      localIntent.putExtra("KSta_MsgId", parambi.field_msgSvrId);
      localIntent.putExtra("KSta_SnsStatExtStr", paramb.cMn);
      if (parama.dFx())
        localIntent.putExtra("KSta_ChatroomMembercount", n.mA(parama.getTalkerUserName()));
      localIntent.putExtra("KMediaId", "fakeid_" + parambi.field_msgId);
      localIntent.putExtra("KMediaVideoTime", paramb.fiH);
      localIntent.putExtra("StremWebUrl", paramb.fiK);
      localIntent.putExtra("StreamWording", paramb.fiJ);
      localIntent.putExtra("KMediaTitle", paramb.title);
      com.tencent.mm.bp.d.b(parama.yTx.getContext(), "sns", ".ui.VideoAdPlayerUI", localIntent);
      bool = true;
      break;
    }
  }

  public abstract boolean aH(int paramInt, boolean paramBoolean);

  public String b(com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    Object localObject;
    if (dHk())
      localObject = parama.dFu();
    String str;
    do
    {
      return localObject;
      str = parama.getTalkerUserName();
      localObject = str;
    }
    while (!b(parama));
    if (parama.dFx())
    {
      parama = bf.oy(parambi.field_content);
      if ((str == null) || (parama == null) || (parama.length() <= 0))
        break label79;
    }
    while (true)
    {
      localObject = parama;
      break;
      if (parambi != null)
        parama = parambi.field_bizChatUserId;
      else
        label79: parama = str;
    }
  }

  protected final void b(com.tencent.mm.ui.chatting.d.a parama, View paramView, Object paramObject)
  {
    paramView.setTag(paramObject);
    if (this.zbp == null)
      this.zbp = new s.h(parama);
    paramView.setOnClickListener(this.zbp);
  }

  public abstract boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi);

  protected boolean b(com.tencent.mm.ui.chatting.d.a parama)
  {
    boolean bool;
    if (dHk())
      bool = false;
    while (true)
    {
      return bool;
      if ((parama.dFx()) || (((com.tencent.mm.ui.chatting.c.b.d)parama.aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm()))
        bool = true;
      else
        bool = false;
    }
  }

  protected final c.c c(com.tencent.mm.ui.chatting.d.a parama)
  {
    if (this.zbh == null)
      this.zbh = new c.c(this, parama);
    return this.zbh;
  }

  protected final c.d d(com.tencent.mm.ui.chatting.d.a parama)
  {
    if (this.zbj == null)
    {
      if (!(parama.yTx instanceof AppBrandServiceChattingUI.AppBrandServiceChattingFmUI))
        break label47;
      parama = (AppBrandServiceChattingUI.AppBrandServiceChattingFmUI)parama.yTx;
    }
    label47: for (this.zbj = new AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.3(parama, parama.cgL, this); ; this.zbj = new c.d(parama, this))
      return this.zbj;
  }

  protected boolean dHj()
  {
    return true;
  }

  abstract boolean dHk();

  boolean dHl()
  {
    return true;
  }

  protected boolean dHn()
  {
    return true;
  }

  protected final s.b e(com.tencent.mm.ui.chatting.d.a parama)
  {
    if (this.zbl == null)
      this.zbl = new s.b(parama);
    return this.zbl;
  }

  protected final s.d f(com.tencent.mm.ui.chatting.d.a parama)
  {
    if (this.zbm == null)
      this.zbm = new s.d(parama);
    return this.zbm;
  }

  protected final s.p h(com.tencent.mm.ui.chatting.d.a parama)
  {
    if (this.zbo == null)
      this.zbo = new s.p(parama);
    return this.zbo;
  }

  protected final s.k i(com.tencent.mm.ui.chatting.d.a parama)
  {
    if (this.zbq == null)
      this.zbq = new s.k(parama);
    return this.zbq;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.c
 * JD-Core Version:    0.6.2
 */