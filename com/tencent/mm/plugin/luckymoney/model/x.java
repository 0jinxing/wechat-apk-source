package com.tencent.mm.plugin.luckymoney.model;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ah.i;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.al;
import com.tencent.mm.g.a.al.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.bf;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.atm;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class x
{
  private static f<String, Bitmap> mkq;
  public static int nYd;

  static
  {
    AppMethodBeat.i(42386);
    nYd = 2147483647;
    mkq = new com.tencent.mm.memory.a.b(10, x.class);
    AppMethodBeat.o(42386);
  }

  public static boolean E(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(42377);
    boolean bool;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.w("MicroMsg.LuckyMoneyUtil", bo.nullAsNil(paramString1) + ", " + bo.nullAsNil(paramString2));
      AppMethodBeat.o(42377);
      bool = false;
      return bool;
    }
    bi localbi = new bi();
    localbi.setContent(paramString1);
    localbi.setStatus(2);
    localbi.ju(paramString2);
    localbi.eJ(bf.oC(paramString2));
    localbi.hO(1);
    if (paramInt == 3)
      localbi.setType(469762097);
    long l;
    while (true)
    {
      l = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(localbi);
      if (l >= 0L)
        break label196;
      ab.e("MicroMsg.LuckyMoneyUtil", com.tencent.mm.compatible.util.g.Mq() + "insert msg failed :" + l);
      AppMethodBeat.o(42377);
      bool = false;
      break;
      localbi.setType(436207665);
    }
    label196: label217: com.tencent.mm.af.j localj;
    if (localbi.bAA())
    {
      com.tencent.mm.modelstat.b.fRa.a(localbi, com.tencent.mm.af.k.k(localbi));
      localbi.setMsgId(l);
      localj = new com.tencent.mm.af.j();
      localj.field_xml = localbi.field_content;
      paramString2 = bo.anj(paramString1);
      paramString1 = null;
      if (paramString2 != null)
      {
        paramString2 = j.b.X(paramString2, localbi.field_reserved);
        paramString1 = paramString2;
        if (paramString2 != null)
        {
          localj.field_title = paramString2.title;
          localj.field_description = paramString2.description;
          paramString1 = paramString2;
        }
      }
      localj.field_type = 2001;
      localj.field_msgId = l;
      if ((paramString1 != null) && (paramString1.type == 2001) && (paramString1.showType == 1))
      {
        if ((TextUtils.isEmpty(paramString1.fic)) || (TextUtils.isEmpty(paramString1.fid)) || (paramString1.fie <= 0))
          break label478;
        ab.i("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! send predownload image event!");
        paramString2 = new al();
        paramString2.ctv = new al.a();
        paramString2.ctv.cty = paramString1.fid;
        paramString2.ctv.ctw = paramString1.fic;
        paramString2.ctv.ctz = paramString1.fie;
        com.tencent.mm.sdk.b.a.xxA.m(paramString2);
      }
      label421: paramString1 = com.tencent.mm.plugin.s.a.bYK().ma(l);
      if ((paramString1 == null) || (paramString1.field_msgId != l))
        break label489;
      com.tencent.mm.plugin.s.a.bYK().c(localj, new String[0]);
    }
    while (true)
    {
      AppMethodBeat.o(42377);
      bool = true;
      break;
      com.tencent.mm.modelstat.b.fRa.j(localbi);
      break label217;
      label478: ab.e("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! don't send predownload image event, because image preload data is illegal!");
      break label421;
      label489: if (!com.tencent.mm.plugin.s.a.bYK().b(localj))
        ab.e("MicroMsg.LuckyMoneyUtil", "PinOpenApi.getAppMessageStorage().insert msg failed id:".concat(String.valueOf(l)));
    }
  }

  public static String Qj(String paramString)
  {
    bbv localbbv = null;
    AppMethodBeat.i(42369);
    Object localObject = com.tencent.mm.ah.o.act().qo(paramString);
    if (localObject != null)
    {
      paramString = ((com.tencent.mm.ah.h)localObject).acl();
      AppMethodBeat.o(42369);
    }
    while (true)
    {
      return paramString;
      com.tencent.mm.kernel.g.RQ();
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
      if ((localObject == null) || (!((ap)localObject).field_username.equals(paramString)))
      {
        AppMethodBeat.o(42369);
        paramString = localbbv;
        continue;
      }
      if (((ap)localObject).dtR == 4)
      {
        AppMethodBeat.o(42369);
        paramString = localbbv;
        continue;
      }
      com.tencent.mm.kernel.g.RQ();
      paramString = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoS(paramString);
      if (bo.cb(paramString))
      {
        AppMethodBeat.o(42369);
        paramString = localbbv;
        continue;
      }
      try
      {
        localbbv = new com/tencent/mm/protocal/protobuf/bbv;
        localbbv.<init>();
        paramString = ((bbv)localbbv.parseFrom(paramString)).vXn;
        AppMethodBeat.o(42369);
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.LuckyMoneyUtil", "exception:%s", new Object[] { bo.l(paramString) });
          paramString = null;
        }
      }
    }
  }

  public static String Qk(String paramString)
  {
    AppMethodBeat.i(42380);
    if ((bo.isNullOrNil(paramString)) || (!com.tencent.mm.kernel.g.RK()))
    {
      paramString = "";
      AppMethodBeat.o(42380);
    }
    while (true)
    {
      return paramString;
      com.tencent.mm.kernel.g.RQ();
      File localFile = new File(String.format("%s/%s/", new Object[] { com.tencent.mm.kernel.g.RP().eJM, "LuckyMoney" }));
      if ((!localFile.exists()) || (!localFile.isDirectory()))
        localFile.mkdirs();
      paramString = new File(localFile, paramString).getAbsolutePath();
      AppMethodBeat.o(42380);
    }
  }

  public static void a(Context paramContext, TextView paramTextView, String paramString)
  {
    AppMethodBeat.i(42365);
    if (paramTextView == null)
      AppMethodBeat.o(42365);
    while (true)
    {
      return;
      paramTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, paramString, paramTextView.getTextSize()));
      AppMethodBeat.o(42365);
    }
  }

  public static void a(View paramView, Animation.AnimationListener paramAnimationListener)
  {
    AppMethodBeat.i(42373);
    ScaleAnimation localScaleAnimation1 = new ScaleAnimation(0.0F, 0.96F, 0.0F, 0.96F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation1.setDuration(300L);
    localScaleAnimation1.setInterpolator(new OvershootInterpolator());
    localScaleAnimation1.setFillAfter(true);
    ScaleAnimation localScaleAnimation2 = new ScaleAnimation(0.96F, 1.0F, 0.96F, 1.0F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation2.setDuration(100L);
    localScaleAnimation2.setFillAfter(true);
    localScaleAnimation1.setAnimationListener(new x.2(paramView, localScaleAnimation2));
    if (paramAnimationListener != null)
      localScaleAnimation2.setAnimationListener(paramAnimationListener);
    if (paramView != null)
      paramView.startAnimation(localScaleAnimation1);
    AppMethodBeat.o(42373);
  }

  public static void a(ImageView paramImageView, String paramString1, String paramString2)
  {
    AppMethodBeat.i(42360);
    a(paramImageView, paramString1, paramString2, false);
    AppMethodBeat.o(42360);
  }

  private static void a(ImageView paramImageView, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(42359);
    ab.i("MicroMsg.LuckyMoneyUtil", "load url: %s", new Object[] { paramString1 });
    if (paramImageView != null)
      paramImageView.setImageBitmap(null);
    com.tencent.mm.at.a.a.c.a locala;
    if (!bo.isNullOrNil(paramString1))
    {
      locala = new com.tencent.mm.at.a.a.c.a();
      com.tencent.mm.plugin.luckymoney.b.a.bKN();
      locala.ePK = com.tencent.mm.plugin.luckymoney.b.a.bKP();
      locala.ePH = true;
      locala.ePZ = true;
      locala.eQf = paramBoolean;
      if (paramBoolean)
        locala.eQg = 0.0F;
      if (bo.isNullOrNil(paramString2))
        break label128;
      locala.cvZ = paramString2;
    }
    label128: for (locala.ePP = true; ; locala.ePP = false)
    {
      paramString2 = locala.ahG();
      com.tencent.mm.at.o.ahp().a(paramString1, paramImageView, paramString2);
      AppMethodBeat.o(42359);
      return;
    }
  }

  public static void a(MMActivity paramMMActivity, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(42366);
    if ((paramInt1 == 0) && (paramInt2 > 1))
    {
      Intent localIntent = new Intent();
      localIntent.setClass(paramMMActivity, SelectLuckyMoneyContactUI.class);
      localIntent.putExtra("key_friends_num", paramInt2);
      if (paramBoolean)
        localIntent.putExtra("scene_from", 5);
      paramMMActivity.startActivityForResult(localIntent, 2);
      AppMethodBeat.o(42366);
    }
    while (true)
    {
      return;
      a(paramMMActivity, 2, paramBoolean);
      AppMethodBeat.o(42366);
    }
  }

  public static void a(MMActivity paramMMActivity, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(42367);
    Intent localIntent = new Intent();
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("Select_Conv_Type", 3);
    if (paramBoolean)
      localIntent.putExtra("scene_from", 5);
    d.b(paramMMActivity, ".ui.transmit.SelectConversationUI", localIntent, paramInt);
    AppMethodBeat.o(42367);
  }

  public static void a(StringBuilder paramStringBuilder, EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(42383);
    a(paramStringBuilder, paramEmojiInfo, 0);
    AppMethodBeat.o(42383);
  }

  public static void a(StringBuilder paramStringBuilder, EmojiInfo paramEmojiInfo, int paramInt)
  {
    AppMethodBeat.i(42384);
    EmojiInfo localEmojiInfo = paramEmojiInfo;
    if (paramEmojiInfo == null)
      localEmojiInfo = new EmojiInfo();
    paramStringBuilder.append("<emoji>");
    paramStringBuilder.append("<localreceivestatus>").append(paramInt).append("</localreceivestatus>");
    paramStringBuilder.append("<md5>").append(j.b.mf(localEmojiInfo.field_md5)).append("</md5>");
    paramStringBuilder.append("<type>").append(localEmojiInfo.field_type).append("</type>");
    paramStringBuilder.append("<width>").append(localEmojiInfo.field_width).append("</width>");
    paramStringBuilder.append("<height>").append(localEmojiInfo.field_height).append("</height>");
    paramStringBuilder.append("<len>").append(localEmojiInfo.field_size).append("</len>");
    paramStringBuilder.append("<aeskey>").append(j.b.mf(localEmojiInfo.field_aeskey)).append("</aeskey>");
    paramStringBuilder.append("<cdnurl>").append(j.b.mf(localEmojiInfo.field_cdnUrl)).append("</cdnurl>");
    paramStringBuilder.append("<encrypturl>").append(j.b.mf(localEmojiInfo.field_encrypturl)).append("</encrypturl>");
    paramStringBuilder.append("<externurl>").append(j.b.mf(localEmojiInfo.field_externUrl)).append("</externurl>");
    paramStringBuilder.append("<externmd5>").append(j.b.mf(localEmojiInfo.field_externMd5)).append("</externmd5>");
    paramStringBuilder.append("<productid>").append(j.b.mf(localEmojiInfo.field_groupId)).append("</productid>");
    paramStringBuilder.append("<designerid>").append(j.b.mf(localEmojiInfo.field_designerID)).append("</designerid>");
    paramStringBuilder.append("<attachedtext>").append(j.b.mf(localEmojiInfo.field_attachedText)).append("</attachedtext>");
    paramStringBuilder.append("</emoji>");
    AppMethodBeat.o(42384);
  }

  public static boolean a(Activity paramActivity, int paramInt1, m paramm, Bundle paramBundle, boolean paramBoolean, com.tencent.mm.wallet_core.c.a parama, int paramInt2)
  {
    AppMethodBeat.i(42378);
    ab.i("MicroMsg.LuckyMoneyUtil", "dealWithRealNameVerifyErr call");
    if (paramInt1 != 416)
    {
      ab.i("MicroMsg.LuckyMoneyUtil", "don't need realname verify");
      paramBoolean = false;
      AppMethodBeat.o(42378);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = a(paramActivity, paramm, paramBundle, paramBoolean, parama, paramInt2);
      AppMethodBeat.o(42378);
    }
  }

  private static boolean a(Activity paramActivity, m paramm, Bundle paramBundle, boolean paramBoolean, com.tencent.mm.wallet_core.c.a parama, int paramInt)
  {
    AppMethodBeat.i(42379);
    String str1 = "";
    String str2 = "";
    String str3 = "";
    String str4 = "";
    Object localObject;
    if ((paramm != null) && ((paramm instanceof z)))
    {
      paramm = ((z)paramm).ehh;
      if (paramm != null)
      {
        paramm = (atm)paramm.fsH.fsP;
        if (paramm.wxA != null)
          localObject = aa.b(paramm.wxA);
      }
    }
    label347: 
    while (true)
    {
      try
      {
        paramm = new org/json/JSONObject;
        paramm.<init>((String)localObject);
        if (paramm == null)
          break label347;
        ab.i("MicroMsg.LuckyMoneyUtil", "dealWithRealNameVerifyErr json is not null");
        localObject = paramm;
        if (paramm.has("real_name_info"))
          localObject = paramm.optJSONObject("real_name_info");
        str3 = ((JSONObject)localObject).optString("guide_flag", "");
        str1 = ((JSONObject)localObject).optString("guide_wording");
        str2 = ((JSONObject)localObject).optString("left_button_wording", paramActivity.getString(2131296868));
        paramm = ((JSONObject)localObject).optString("right_button_wording", paramActivity.getString(2131296994));
        str4 = ((JSONObject)localObject).optString("upload_credit_url", "");
        localObject = str3;
        if (!"1".equals(localObject))
          break label249;
        ab.i("MicroMsg.LuckyMoneyUtil", "showRealnameDialog");
        paramBoolean = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, paramBundle, parama, paramInt);
        AppMethodBeat.o(42379);
        return paramBoolean;
      }
      catch (JSONException paramm)
      {
        ab.printErrStackTrace("MicroMsg.LuckyMoneyUtil", paramm, "", new Object[0]);
      }
      paramm = null;
      continue;
      label249: if (("2".equals(localObject)) && (!bo.isNullOrNil(str4)))
      {
        ab.i("MicroMsg.LuckyMoneyUtil", "showUploadCreditDialog");
        paramBoolean = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, str1, str4, str2, paramm, paramBoolean, null);
        AppMethodBeat.o(42379);
      }
      else
      {
        ab.e("MicroMsg.LuckyMoneyUtil", "guide_flag=" + (String)localObject + ";upload_credit_url=null?" + bo.isNullOrNil(str4));
        paramBoolean = false;
        AppMethodBeat.o(42379);
        continue;
        localObject = "";
        paramm = str3;
      }
    }
  }

  public static void b(Button paramButton)
  {
    AppMethodBeat.i(42374);
    c(paramButton);
    AppMethodBeat.o(42374);
  }

  public static void b(ImageView paramImageView, String paramString1, String paramString2)
  {
    AppMethodBeat.i(42363);
    if (paramImageView == null)
    {
      AppMethodBeat.o(42363);
      return;
    }
    if (!bo.isNullOrNil(paramString2));
    while (true)
    {
      a.b.a(paramImageView, paramString2, 0.1F, false);
      AppMethodBeat.o(42363);
      break;
      paramString2 = com.tencent.mm.ah.o.acv().qc(paramString1);
    }
  }

  public static String bLC()
  {
    AppMethodBeat.i(42368);
    com.tencent.mm.kernel.g.RQ();
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJM, null);
    AppMethodBeat.o(42368);
    return str;
  }

  public static void c(Button paramButton)
  {
    AppMethodBeat.i(42375);
    if (paramButton == null)
      AppMethodBeat.o(42375);
    while (true)
    {
      return;
      paramButton.setBackgroundResource(2130838801);
      paramButton = (AnimationDrawable)paramButton.getBackground();
      if (paramButton != null)
        paramButton.start();
      AppMethodBeat.o(42375);
    }
  }

  public static String cl(List<as> paramList)
  {
    AppMethodBeat.i(42381);
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.e("MicroMsg.LuckyMoneyUtil", "splitOperationField is empty!");
      paramList = "";
      AppMethodBeat.o(42381);
    }
    while (true)
    {
      return paramList;
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; i < paramList.size(); i++)
      {
        as localas = (as)paramList.get(i);
        if (localas != null)
        {
          if (i != 0)
            localStringBuilder.append("|");
          localStringBuilder.append(localas.type);
          localStringBuilder.append("|");
          localStringBuilder.append(localas.name);
        }
      }
      paramList = localStringBuilder.toString();
      AppMethodBeat.o(42381);
    }
  }

  public static void d(Button paramButton)
  {
    AppMethodBeat.i(42376);
    if (paramButton == null)
      AppMethodBeat.o(42376);
    while (true)
    {
      return;
      if (!(paramButton.getBackground() instanceof AnimationDrawable))
      {
        AppMethodBeat.o(42376);
      }
      else
      {
        paramButton = (AnimationDrawable)paramButton.getBackground();
        if (paramButton != null)
          paramButton.stop();
        AppMethodBeat.o(42376);
      }
    }
  }

  public static void dn(View paramView)
  {
    AppMethodBeat.i(42372);
    ScaleAnimation localScaleAnimation1 = new ScaleAnimation(0.4F, 0.96F, 0.4F, 0.96F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation1.setDuration(200L);
    localScaleAnimation1.setInterpolator(new OvershootInterpolator());
    localScaleAnimation1.setFillAfter(true);
    ScaleAnimation localScaleAnimation2 = new ScaleAnimation(0.96F, 1.0F, 0.96F, 1.0F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation2.setDuration(100L);
    localScaleAnimation2.setFillAfter(true);
    localScaleAnimation1.setAnimationListener(new x.1(paramView, localScaleAnimation2));
    if (paramView != null)
      paramView.startAnimation(localScaleAnimation1);
    AppMethodBeat.o(42372);
  }

  public static void eV(String paramString1, String paramString2)
  {
    AppMethodBeat.i(42382);
    if ((!bo.isNullOrNil(paramString1)) && (!bo.isNullOrNil(paramString2)))
    {
      bi localbi = new bi();
      localbi.hO(0);
      localbi.ju(paramString2);
      localbi.setStatus(3);
      localbi.setContent(paramString1);
      localbi.eJ(bf.q(paramString2, System.currentTimeMillis() / 1000L));
      localbi.setType(10000);
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(localbi);
    }
    AppMethodBeat.o(42382);
  }

  public static int eq(Context paramContext)
  {
    AppMethodBeat.i(42371);
    if (nYd == 2147483647)
      nYd = paramContext.getResources().getColor(2131690222);
    int i = nYd;
    AppMethodBeat.o(42371);
    return i;
  }

  public static Dialog er(Context paramContext)
  {
    AppMethodBeat.i(42385);
    paramContext = com.tencent.mm.ui.base.h.a(paramContext, 3, 2131493296, paramContext.getString(2131300968), false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
      }
    });
    AppMethodBeat.o(42385);
    return paramContext;
  }

  public static void h(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(42361);
    a(paramImageView, paramString, null, false);
    AppMethodBeat.o(42361);
  }

  public static String j(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(42357);
    Object localObject = new GregorianCalendar();
    if (paramLong < 3600000L)
    {
      paramContext = "";
      AppMethodBeat.o(42357);
    }
    while (true)
    {
      return paramContext;
      long l = paramLong - new GregorianCalendar(((GregorianCalendar)localObject).get(1), ((GregorianCalendar)localObject).get(2), ((GregorianCalendar)localObject).get(5)).getTimeInMillis();
      if ((l > 0L) && (l <= 86400000L))
      {
        paramContext = new SimpleDateFormat("HH:mm").format(new Date(paramLong));
        AppMethodBeat.o(42357);
      }
      else
      {
        localObject = new Time();
        ((Time)localObject).set(paramLong);
        paramContext = com.tencent.mm.pluginsdk.f.g.a(paramContext.getString(2131299935, new Object[] { " " }), (Time)localObject).toString();
        AppMethodBeat.o(42357);
      }
    }
  }

  public static void k(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(42358);
    a(paramImageView, paramString, null, true);
    AppMethodBeat.o(42358);
  }

  public static void l(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(42362);
    if (paramImageView == null)
      AppMethodBeat.o(42362);
    while (true)
    {
      return;
      paramImageView.setImageBitmap(null);
      if (!bo.isNullOrNil(paramString))
      {
        Object localObject = new com.tencent.mm.at.a.a.c.a();
        com.tencent.mm.plugin.luckymoney.b.a.bKN();
        ((com.tencent.mm.at.a.a.c.a)localObject).ePK = com.tencent.mm.plugin.luckymoney.b.a.bKP();
        ((com.tencent.mm.at.a.a.c.a)localObject).ePH = true;
        ((com.tencent.mm.at.a.a.c.a)localObject).ePZ = true;
        ((com.tencent.mm.at.a.a.c.a)localObject).eQf = false;
        ((com.tencent.mm.at.a.a.c.a)localObject).ePT = 2130839310;
        localObject = ((com.tencent.mm.at.a.a.c.a)localObject).ahG();
        com.tencent.mm.at.o.ahp().a(paramString, paramImageView, (com.tencent.mm.at.a.a.c)localObject);
      }
      AppMethodBeat.o(42362);
    }
  }

  public static void m(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(42364);
    if (paramImageView == null)
      AppMethodBeat.o(42364);
    while (true)
    {
      return;
      paramImageView.setImageBitmap(null);
      if (!bo.isNullOrNil(paramString))
      {
        Object localObject = new com.tencent.mm.at.a.a.c.a();
        com.tencent.mm.plugin.luckymoney.b.a.bKN();
        ((com.tencent.mm.at.a.a.c.a)localObject).ePK = com.tencent.mm.plugin.luckymoney.b.a.bKP();
        ((com.tencent.mm.at.a.a.c.a)localObject).ePH = true;
        ((com.tencent.mm.at.a.a.c.a)localObject).ePZ = true;
        ((com.tencent.mm.at.a.a.c.a)localObject).eQf = true;
        ((com.tencent.mm.at.a.a.c.a)localObject).fHe = 1;
        ((com.tencent.mm.at.a.a.c.a)localObject).ePT = 2130839243;
        localObject = ((com.tencent.mm.at.a.a.c.a)localObject).ahG();
        com.tencent.mm.at.o.ahp().a(paramString, paramImageView, (com.tencent.mm.at.a.a.c)localObject);
      }
      AppMethodBeat.o(42364);
    }
  }

  public static String mI(String paramString)
  {
    AppMethodBeat.i(42370);
    com.tencent.mm.kernel.g.RQ();
    ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
    if ((localad == null) || (!localad.field_username.equals(paramString)))
    {
      paramString = null;
      AppMethodBeat.o(42370);
    }
    while (true)
    {
      return paramString;
      paramString = localad.field_nickname;
      AppMethodBeat.o(42370);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.x
 * JD-Core Version:    0.6.2
 */