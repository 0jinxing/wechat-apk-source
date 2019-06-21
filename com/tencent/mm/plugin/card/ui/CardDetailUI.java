package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qk;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.card.b.c.a;
import com.tencent.mm.plugin.card.b.d.a;
import com.tencent.mm.plugin.card.b.g.a;
import com.tencent.mm.plugin.card.b.i.a;
import com.tencent.mm.plugin.card.b.j.a;
import com.tencent.mm.plugin.card.b.j.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.aa;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.t;
import com.tencent.mm.plugin.card.model.v;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI;
import com.tencent.mm.plugin.card.ui.view.x;
import com.tencent.mm.protocal.protobuf.cdc;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.oj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.bc.a;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.MMVerticalTextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CardDetailUI extends CardDetailBaseUI
  implements com.tencent.mm.ai.f, c.a, d.a, j.a, bc.a
{
  private final String TAG;
  private float ecs;
  private float ect;
  private b.a ecy;
  private com.tencent.mm.ui.base.p ejZ;
  private int emC;
  private String fhu;
  private com.tencent.mm.modelgeo.d fwu;
  private String kaE;
  private com.tencent.mm.plugin.card.base.b kaS;
  private ArrayList<od> kaY;
  private String kbQ;
  private boolean kcf;
  private Vibrator kgA;
  private boolean kgB;
  private int kgn;
  private boolean khx;
  e kiM;
  private String kiN;
  private String kiO;
  private String kiP;
  private boolean kiQ;
  private boolean kiR;
  private boolean kiS;
  private String kiT;
  private e.a kiU;
  private boolean kiV;
  private boolean kiW;
  private boolean kiX;
  private boolean kiY;
  private String kiZ;
  private int kiq;
  private String kir;
  private String kis;
  private String kit;
  private com.tencent.mm.plugin.card.b.i kja;
  ak mHandler;
  private long mStartTime;

  public CardDetailUI()
  {
    AppMethodBeat.i(88286);
    this.TAG = "MicroMsg.CardDetailUI";
    this.ejZ = null;
    this.kaE = "";
    this.kbQ = "";
    this.kiN = "";
    this.kiO = "";
    this.kiP = "";
    this.kir = "";
    this.kis = "";
    this.kit = "";
    this.kcf = false;
    this.kiQ = false;
    this.kiR = false;
    this.kiS = false;
    this.fhu = "";
    this.kiT = "";
    this.kgB = false;
    this.mHandler = new ak();
    this.emC = 3;
    this.kiq = 0;
    this.kgn = -1;
    this.kiV = false;
    this.kiW = true;
    this.mStartTime = 0L;
    this.kiX = false;
    this.khx = false;
    this.kiY = false;
    this.ecs = -85.0F;
    this.ect = -1000.0F;
    this.kiZ = "";
    this.kja = new com.tencent.mm.plugin.card.b.i();
    this.ecy = new CardDetailUI.1(this);
    AppMethodBeat.o(88286);
  }

  private void Gl(String paramString)
  {
    try
    {
      AppMethodBeat.i(88312);
      if (this.kgB)
      {
        ab.e("MicroMsg.CardDetailUI", "has start CardConsumeSuccessUI!");
        AppMethodBeat.o(88312);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.CardDetailUI", "startConsumedSuccUI() ");
        this.kgB = true;
        Intent localIntent = new android/content/Intent;
        localIntent.<init>(this, CardConsumeSuccessUI.class);
        localIntent.putExtra("KEY_CARD_ID", this.kaS.aZZ());
        localIntent.putExtra("KEY_CARD_CONSUMED_JSON", paramString);
        localIntent.putExtra("KEY_CARD_COLOR", this.kaS.aZV().color);
        localIntent.putExtra("key_stastic_scene", this.emC);
        localIntent.putExtra("key_from_scene", 0);
        startActivity(localIntent);
        AppMethodBeat.o(88312);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  private void a(j.b paramb)
  {
    AppMethodBeat.i(88320);
    if (this.kiM.cAY)
    {
      ab.i("MicroMsg.CardDetailUI", "UI is pause, not to jumpMarkUI()");
      AppMethodBeat.o(88320);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardDetailUI", "jumpMarkUI()");
      this.kiM.a(this.kiS, paramb, true);
      AppMethodBeat.o(88320);
    }
  }

  private void aZt()
  {
    AppMethodBeat.i(88308);
    if (this.fwu == null)
      this.fwu = com.tencent.mm.modelgeo.d.agz();
    this.fwu.a(this.ecy, true);
    AppMethodBeat.o(88308);
  }

  private void aZv()
  {
    AppMethodBeat.i(88309);
    if (this.fwu != null)
      this.fwu.c(this.ecy);
    AppMethodBeat.o(88309);
  }

  private void bbB()
  {
    AppMethodBeat.i(88297);
    this.kiU.emC = this.emC;
    this.kiU.kgn = this.kgn;
    this.kiU.kaE = this.kaE;
    this.kiM.a(this.kaS, this.kiU, this.kaY);
    this.kiM.bbB();
    am.bbh().kaS = this.kaS;
    AppMethodBeat.o(88297);
  }

  private void bbN()
  {
    AppMethodBeat.i(88310);
    this.fwu = com.tencent.mm.modelgeo.d.agz();
    aZt();
    AppMethodBeat.o(88310);
  }

  private void bci()
  {
    AppMethodBeat.i(88292);
    com.tencent.mm.kernel.g.RO().eJo.a(645, this);
    com.tencent.mm.kernel.g.RO().eJo.a(651, this);
    com.tencent.mm.kernel.g.RO().eJo.a(563, this);
    com.tencent.mm.kernel.g.RO().eJo.a(652, this);
    com.tencent.mm.kernel.g.RO().eJo.a(560, this);
    com.tencent.mm.kernel.g.RO().eJo.a(699, this);
    com.tencent.mm.kernel.g.RO().eJo.a(902, this);
    com.tencent.mm.kernel.g.RO().eJo.a(904, this);
    com.tencent.mm.kernel.g.RO().eJo.a(1163, this);
    AppMethodBeat.o(88292);
  }

  private void bcj()
  {
    AppMethodBeat.i(88293);
    com.tencent.mm.kernel.g.RO().eJo.b(645, this);
    com.tencent.mm.kernel.g.RO().eJo.b(651, this);
    com.tencent.mm.kernel.g.RO().eJo.b(563, this);
    com.tencent.mm.kernel.g.RO().eJo.b(652, this);
    com.tencent.mm.kernel.g.RO().eJo.b(560, this);
    com.tencent.mm.kernel.g.RO().eJo.b(699, this);
    com.tencent.mm.kernel.g.RO().eJo.b(902, this);
    com.tencent.mm.kernel.g.RO().eJo.b(904, this);
    com.tencent.mm.kernel.g.RO().eJo.b(1163, this);
    AppMethodBeat.o(88293);
  }

  private void bck()
  {
    AppMethodBeat.i(88295);
    this.kgn = this.emC;
    this.kiU = new e.a();
    this.kiU.emC = this.emC;
    this.kiU.kgn = this.kgn;
    this.kiU.kaE = this.kaE;
    this.kiU.kiN = this.kiN;
    this.kiU.kiP = this.kiP;
    this.kiU.kiO = this.kiO;
    this.kiU.kir = this.kir;
    this.kiU.kis = this.kis;
    this.kiU.kcf = this.kcf;
    this.kiU.kjL = getIntent().getIntExtra("key_from_appbrand_type", 0);
    AppMethodBeat.o(88295);
  }

  private void bcl()
  {
    int i = 1;
    int j = 1;
    AppMethodBeat.i(88296);
    if ((this.kiX) || (this.kaS == null))
    {
      AppMethodBeat.o(88296);
      return;
    }
    this.kiX = true;
    if (this.kcf)
    {
      localh = com.tencent.mm.plugin.report.service.h.pYm;
      k = this.kaS.aZV().iAd;
      str1 = this.kaS.baa();
      str2 = this.kaS.aZZ();
      i = this.kgn;
      str3 = this.kiN;
      if (this.kaS.aZT());
      while (true)
      {
        localh.e(11324, new Object[] { "ShareCardDetailUI", Integer.valueOf(k), str1, str2, Integer.valueOf(0), Integer.valueOf(i), str3, Integer.valueOf(j), "" });
        AppMethodBeat.o(88296);
        break;
        j = 0;
      }
    }
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
    int m = this.kaS.aZV().iAd;
    String str3 = this.kaS.baa();
    String str2 = this.kaS.aZZ();
    int k = this.kgn;
    String str1 = this.kiN;
    if (this.kaS.aZT());
    for (j = i; ; j = 0)
    {
      localh.e(11324, new Object[] { "CardDetailView", Integer.valueOf(m), str3, str2, Integer.valueOf(0), Integer.valueOf(k), str1, Integer.valueOf(j), "" });
      AppMethodBeat.o(88296);
      break;
    }
  }

  private void bcm()
  {
    AppMethodBeat.i(88302);
    Object localObject = new cdc();
    ((cdc)localObject).xcM = this.fhu;
    ((cdc)localObject).kdi = this.kiT;
    ab.i("MicroMsg.CardDetailUI", "GetCardItemInfo templateId:%s", new Object[] { this.fhu });
    localObject = new aa(this.kaE, this.emC, this.kiN, this.kiP, this.kir, this.kis, this.kiq, this.kit, (cdc)localObject);
    com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject, 0);
    AppMethodBeat.o(88302);
  }

  private void bcn()
  {
    AppMethodBeat.i(88303);
    Object localObject;
    if (!TextUtils.isEmpty(this.kaS.baa()))
    {
      localObject = this.kaS.baa();
      if ((this.kaS == null) || (this.kaS.aZV().vUa != 1))
        break label171;
      float f1 = this.ecs;
      float f2 = this.ect;
      float f3;
      if (f1 != -85.0F)
      {
        f3 = f2;
        if (f2 != -1000.0F);
      }
      else
      {
        f1 = am.bbc().ecs;
        f3 = am.bbc().ect;
      }
      localObject = new v((String)localObject, f3, f1, this.kaS.aZZ());
      com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject, 0);
      AppMethodBeat.o(88303);
    }
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(this.kaE))
      {
        localObject = this.kaE;
        break;
      }
      ab.e("MicroMsg.CardDetailUI", "doNetSceneCardShopLBS card id is null, return");
      AppMethodBeat.o(88303);
      continue;
      label171: if ((this.kaS != null) && (this.kaS.aZV().vUa > 1))
      {
        if ((this.ecs != -85.0F) && (this.ect != -1000.0F))
        {
          this.kiY = false;
          localObject = new v((String)localObject, this.ect, this.ecs, this.kaS.aZZ());
          com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject, 0);
          AppMethodBeat.o(88303);
        }
        else if (!this.kiY)
        {
          this.kiY = true;
          if (this.khx)
          {
            aZt();
            AppMethodBeat.o(88303);
          }
        }
      }
      else if (this.kaS != null)
      {
        this.kaS.a(null);
        bbB();
        if (this.kaS.aZC())
        {
          localObject = am.bbe().GK(this.kaE);
          if (localObject != null)
          {
            ((ShareCardInfo)localObject).a(null);
            am.bbe().c((com.tencent.mm.sdk.e.c)localObject, new String[] { this.kaE });
          }
          AppMethodBeat.o(88303);
        }
        else
        {
          localObject = am.baW().Gu(this.kaE);
          if (localObject != null)
          {
            ((CardInfo)localObject).a(null);
            am.baW().c((com.tencent.mm.sdk.e.c)localObject, new String[] { this.kaE });
          }
        }
      }
      else
      {
        AppMethodBeat.o(88303);
      }
    }
  }

  private void bco()
  {
    AppMethodBeat.i(88304);
    com.tencent.mm.plugin.card.sharecard.model.c localc = new com.tencent.mm.plugin.card.sharecard.model.c(this.kaE);
    com.tencent.mm.kernel.g.RO().eJo.a(localc, 0);
    AppMethodBeat.o(88304);
  }

  private void c(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(88299);
    ab.e("MicroMsg.CardDetailUI", "handleAcceptError, errCode = " + paramInt1 + " errMsg = " + paramString1 + " ret_code:" + paramInt2 + " ret_msg:" + paramString2);
    if (paramInt2 == 10000)
    {
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2))
        paramString1 = getString(2131297795);
      this.kaS.aZW().status = 4;
      bbB();
    }
    while (true)
    {
      com.tencent.mm.plugin.card.d.d.c(this, paramString1);
      AppMethodBeat.o(88299);
      return;
      if (paramInt2 == 10001)
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2))
          paramString1 = getString(2131297799);
        this.kaS.aZW().status = 5;
        bbB();
      }
      else if (paramInt2 == 10002)
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2))
          paramString1 = getString(2131297935);
      }
      else
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2))
          paramString1 = getString(2131297793);
      }
    }
  }

  private void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(88300);
    if (paramBoolean)
    {
      this.ejZ = com.tencent.mm.ui.base.p.b(this, getString(2131300968), true, null);
      AppMethodBeat.o(88300);
    }
    while (true)
    {
      return;
      if ((this.ejZ != null) && (this.ejZ.isShowing()))
      {
        this.ejZ.dismiss();
        this.ejZ = null;
      }
      AppMethodBeat.o(88300);
    }
  }

  private void fI(boolean paramBoolean)
  {
    AppMethodBeat.i(88301);
    if (paramBoolean)
      com.tencent.mm.plugin.card.d.l.dw(this.kiM.kjA, this.kiM.kjz);
    AppMethodBeat.o(88301);
  }

  private void n(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(88306);
    Intent localIntent;
    if (paramInt == 1)
    {
      localIntent = new Intent();
      localIntent.putExtra("key_code", this.kiZ);
      localIntent.putExtra("key_card_id", this.kaE);
      localIntent.putExtra("key_finish_action", paramInt);
      setResult(-1, localIntent);
      if (paramBoolean)
        finish();
      AppMethodBeat.o(88306);
    }
    while (true)
    {
      return;
      if (((this.kgn == 7) || (this.kgn == 8) || (this.kgn == 16) || (this.kgn == 26)) && (this.emC == 3))
      {
        localIntent = new Intent();
        localIntent.putExtra("key_code", this.kiZ);
        if (paramInt > 0)
        {
          localIntent.putExtra("key_card_id", this.kaE);
          localIntent.putExtra("key_finish_action", paramInt);
        }
        setResult(-1, localIntent);
        if (paramBoolean)
          finish();
        AppMethodBeat.o(88306);
      }
      else if (((this.kgn == 7) && (this.emC == 7)) || ((this.kgn == 16) && (this.emC == 16)) || ((this.kgn == 8) && (this.emC == 8)) || ((this.kgn == 26) && (this.emC == 26)))
      {
        setResult(0);
        if (paramBoolean)
        {
          finish();
          AppMethodBeat.o(88306);
        }
      }
      else
      {
        if (paramBoolean)
          finish();
        AppMethodBeat.o(88306);
      }
    }
  }

  private void tb(int paramInt)
  {
    AppMethodBeat.i(88307);
    if ((this.kgn != 7) && (this.kgn != 16))
    {
      ab.i("MicroMsg.CardDetailUI", "mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_JSAPI and mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_NEARBY_PEOPLE_JSAPI ,don't push accept event");
      AppMethodBeat.o(88307);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new com.tencent.mm.plugin.card.model.e();
    ((com.tencent.mm.plugin.card.model.e)localObject).kbU = this.kaS.baa();
    ((com.tencent.mm.plugin.card.model.e)localObject).cMD = this.kiP;
    ((com.tencent.mm.plugin.card.model.e)localObject).code = this.kiZ;
    localLinkedList.add(localObject);
    localObject = new com.tencent.mm.g.a.b();
    ((com.tencent.mm.g.a.b)localObject).crM.bFZ = paramInt;
    if (paramInt == -1);
    for (((com.tencent.mm.g.a.b)localObject).crM.crN = com.tencent.mm.plugin.card.d.h.a(localLinkedList, true, this.kgn); ; ((com.tencent.mm.g.a.b)localObject).crM.crN = com.tencent.mm.plugin.card.d.h.a(localLinkedList, false, this.kgn))
    {
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(88307);
      break;
    }
  }

  public final void Gj(String paramString)
  {
    AppMethodBeat.i(88322);
    if (!TextUtils.isEmpty(paramString))
      com.tencent.mm.plugin.card.d.d.a(this, paramString, true);
    AppMethodBeat.o(88322);
  }

  public final void Gm(String paramString)
  {
    AppMethodBeat.i(88316);
    if (!this.kiM.bcT())
    {
      ab.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onStartConsumedSuccUI");
      AppMethodBeat.o(88316);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardDetailUI", "onStartConsumedSuccUI");
      this.mHandler.post(new CardDetailUI.5(this, paramString));
      AppMethodBeat.o(88316);
    }
  }

  public final void Gp(String paramString)
  {
    AppMethodBeat.i(88319);
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.kaE)))
    {
      ab.e("MicroMsg.CardDetailUI", "onUnmarkSuccess(), the mark card id is diff from current id!");
      AppMethodBeat.o(88319);
    }
    while (true)
    {
      return;
      this.kiQ = false;
      AppMethodBeat.o(88319);
    }
  }

  public final void aNW()
  {
    AppMethodBeat.i(88290);
    com.tencent.mm.plugin.card.ui.view.g localg = this.kiM.kjk;
    if (localg != null)
      localg.bew();
    com.tencent.mm.plugin.report.service.h.pYm.e(16827, new Object[] { this.kaE, Long.valueOf(System.currentTimeMillis() / 1000L) });
    AppMethodBeat.o(88290);
  }

  public final void b(String paramString, j.b paramb)
  {
    AppMethodBeat.i(88317);
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.kaE)))
    {
      ab.e("MicroMsg.CardDetailUI", "onMarkSuccess(), the mark card id is diff from current id!");
      AppMethodBeat.o(88317);
    }
    while (true)
    {
      return;
      fE(false);
      ab.i("MicroMsg.CardDetailUI", "onMarkSuccess()");
      ab.i("MicroMsg.CardDetailUI", "markSucc:" + paramb.kbI + " markCardId: " + paramb.kbJ);
      this.kiR = false;
      if (paramb.kbI == 1)
      {
        if ((!TextUtils.isEmpty(paramb.kbJ)) && (!this.kaS.aZZ().equals(paramb.kbJ)))
        {
          ab.i("MicroMsg.CardDetailUI", "markCardId is diff as now id!");
          if (this.kaS.aZC())
          {
            paramString = am.bbe().GK(paramb.kbJ);
            if (paramString != null)
            {
              this.kaS = paramString;
              this.kaE = paramb.kbJ;
              bbB();
              am.bbh().b(this.kaS);
              ab.i("MicroMsg.CardDetailUI", "update the mCardInfo");
              this.kiQ = true;
              a(paramb);
              AppMethodBeat.o(88317);
              continue;
            }
            ab.e("MicroMsg.CardDetailUI", "The mark card id not exist the card info in DB!， mark failed!");
            com.tencent.mm.plugin.card.d.d.c(this, getString(2131297915));
            this.kiQ = false;
            AppMethodBeat.o(88317);
          }
        }
        else
        {
          ab.i("MicroMsg.CardDetailUI", "markCardId is same as now id!");
          this.kiQ = true;
          a(paramb);
          AppMethodBeat.o(88317);
        }
      }
      else
      {
        this.kiQ = false;
        com.tencent.mm.plugin.card.d.d.c(this, getString(2131297916));
        AppMethodBeat.o(88317);
      }
    }
  }

  public final void bap()
  {
    AppMethodBeat.i(88321);
    ab.i("MicroMsg.CardDetailUI", "code change");
    if ((this.kiM.kjk instanceof com.tencent.mm.plugin.card.ui.view.q))
    {
      ((com.tencent.mm.plugin.card.ui.view.q)this.kiM.kjk).knw = am.bbj().getCode();
      this.kiM.bbB();
    }
    AppMethodBeat.o(88321);
  }

  public final void bau()
  {
    AppMethodBeat.i(88314);
    ab.i("MicroMsg.CardDetailUI", "onVibrate");
    this.kgA.vibrate(300L);
    AppMethodBeat.o(88314);
  }

  public final void bav()
  {
    AppMethodBeat.i(88315);
    ab.i("MicroMsg.CardDetailUI", "onFinishUI");
    AppMethodBeat.o(88315);
  }

  public final void d(com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(88313);
    if (paramb == null)
    {
      ab.e("MicroMsg.CardDetailUI", "cardInfo is empty, not to do onDataChange");
      AppMethodBeat.o(88313);
    }
    while (true)
    {
      return;
      if ((this.kaS == null) || (!this.kaS.aZZ().equals(paramb.aZZ())))
      {
        ab.e("MicroMsg.CardDetailUI", "is not the same card, not to do onDataChange");
        AppMethodBeat.o(88313);
      }
      else if (!this.kiM.bcT())
      {
        ab.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onDataChange");
        AppMethodBeat.o(88313);
      }
      else
      {
        ab.i("MicroMsg.CardDetailUI", "onDataChange");
        this.kaS = paramb;
        this.kaE = this.kaS.aZZ();
        if ((this.kaS.aZQ()) && (am.bbj().isEmpty()))
          am.bbj().Gk(this.kaS.aZZ());
        bbB();
        AppMethodBeat.o(88313);
      }
    }
  }

  public final void dl(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88318);
    if ((!TextUtils.isEmpty(paramString1)) && (!paramString1.equals(this.kaE)))
    {
      ab.e("MicroMsg.CardDetailUI", "onMarkFail(), the mark card id is diff from current id!");
      AppMethodBeat.o(88318);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardDetailUI", "onMarkFail()");
      this.kiQ = false;
      this.kiR = false;
      fE(false);
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2))
        paramString1 = getString(2131297915);
      com.tencent.mm.plugin.card.d.d.c(this, paramString1);
      AppMethodBeat.o(88318);
    }
  }

  public final int getLayoutId()
  {
    return 2130968915;
  }

  public final void initView()
  {
    AppMethodBeat.i(88294);
    setBackBtn(new CardDetailUI.2(this));
    this.kgA = ((Vibrator)getSystemService("vibrator"));
    Object localObject2;
    if (this.kiM == null)
    {
      this.kiM = new e(this, this.mController.contentView);
      localObject1 = this.kiM;
      ((e)localObject1).kjw = new j(((e)localObject1).kjd);
      localObject2 = ((e)localObject1).kjw;
      ((j)localObject2).kgj = ((j)localObject2).knn.getWindow().getAttributes().screenBrightness;
      if (((j)localObject2).gKG == null)
      {
        localObject3 = View.inflate(((j)localObject2).knn, 2130968962, null);
        ((j)localObject2).gKI = ((View)localObject3).findViewById(2131822256);
        ((j)localObject2).gKH = ((ImageView)((View)localObject3).findViewById(2131822257));
        ((j)localObject2).knp = ((TextView)((View)localObject3).findViewById(2131822258));
        ((j)localObject2).knq = ((TextView)((View)localObject3).findViewById(2131822259));
        ((j)localObject2).knr = ((View)localObject3).findViewById(2131822260);
        ((j)localObject2).kns = ((ImageView)((View)localObject3).findViewById(2131822263));
        ((j)localObject2).knt = ((MMVerticalTextView)((View)localObject3).findViewById(2131822262));
        ((j)localObject2).knu = ((MMVerticalTextView)((View)localObject3).findViewById(2131822261));
        ((View)localObject3).setOnClickListener(new j.2((j)localObject2));
        ((j)localObject2).gKG = new com.tencent.mm.ui.base.o((View)localObject3, -1, -1, true);
        ((j)localObject2).gKG.update();
        ((j)localObject2).gKG.setBackgroundDrawable(new ColorDrawable(16777215));
        ((j)localObject2).gKG.setOnDismissListener(new j.3((j)localObject2));
      }
      ((e)localObject1).kjy = new com.tencent.mm.plugin.card.b.f(((e)localObject1).kjd);
      ((e)localObject1).kjd.ifE = ((MMActivity.a)localObject1);
      com.tencent.mm.sdk.b.a.xxA.c(((e)localObject1).kjH);
      localObject1 = this.kiM;
      if (((e)localObject1).kjf == null)
      {
        ((e)localObject1).kjf = new x();
        ((e)localObject1).kjf.a((n)localObject1);
      }
      if (((e)localObject1).kjh == null)
      {
        ((e)localObject1).kjh = new com.tencent.mm.plugin.card.ui.view.o();
        ((e)localObject1).kjh.a((n)localObject1);
      }
      if (((e)localObject1).kji == null)
      {
        ((e)localObject1).kji = new com.tencent.mm.plugin.card.ui.view.a();
        ((e)localObject1).kji.a((n)localObject1);
      }
      ((e)localObject1).mListView = ((ListView)((e)localObject1).findViewById(2131822036));
      ((e)localObject1).kjl = new m(((e)localObject1).kjd.mController.ylL);
      ((e)localObject1).kjl.koa = ((e)localObject1).gKK;
      ((e)localObject1).mListView.setAdapter(((e)localObject1).kjl);
      ((e)localObject1).kjl.notifyDataSetChanged();
      ((e)localObject1).mListView.setOnItemClickListener(new e.1((e)localObject1));
      ab.i("MicroMsg.CardDetailUIContoller", "initMenu");
      Object localObject3 = ((e)localObject1).kjd;
      localObject2 = new e.5((e)localObject1);
      ((CardDetailBaseUI)localObject3).kiG.setOnClickListener((View.OnClickListener)localObject2);
      ((e)localObject1).lK = ((LinearLayout)((e)localObject1).findViewById(2131822020));
      ((e)localObject1).kju = new com.tencent.mm.plugin.card.ui.view.d();
      ((e)localObject1).kju.a((n)localObject1);
      ((e)localObject1).kjw.kaS = ((e)localObject1).kaS;
    }
    int i = getIntent().getIntExtra("key_from_scene", -1);
    ab.i("MicroMsg.CardDetailUI", "scene:%d", new Object[] { Integer.valueOf(i) });
    int j;
    if ((i == 2) || (i == 6) || (i == 5))
    {
      this.emC = i;
      localObject1 = getIntent().getStringExtra("key_card_app_msg");
      localObject2 = com.tencent.mm.plugin.card.d.g.Hi((String)localObject1);
      if (localObject2 != null)
      {
        this.kaE = ((com.tencent.mm.plugin.card.model.d)localObject2).cMC;
        this.kiN = ((com.tencent.mm.plugin.card.model.d)localObject2).kde;
        this.kiP = ((com.tencent.mm.plugin.card.model.d)localObject2).cMD;
        j = ((com.tencent.mm.plugin.card.model.d)localObject2).kdh;
        ab.i("MicroMsg.CardDetailUI", "scene is " + i + ", isRecommend is " + j);
        if ((j == 1) && (i == 2))
          this.emC = 23;
        this.kiT = ((com.tencent.mm.plugin.card.model.d)localObject2).kdi;
        ab.i("MicroMsg.CardDetailUI", "recommend_card_id is " + this.kiT);
      }
      this.kiO = com.tencent.mm.plugin.card.d.g.Hj((String)localObject1);
      bck();
      if (!TextUtils.isEmpty(this.kaE))
        break label1729;
      ab.e("MicroMsg.CardDetailUI", "initData, mCardId is null");
      n(true, -1);
    }
    while (true)
    {
      this.kiM.a(this.kaS, this.kiU, this.kaY);
      this.kiM.kjE = new CardDetailUI.3(this);
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
      ab.i("MicroMsg.CardDetailUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
      this.khx = bool;
      if (this.khx)
      {
        this.fwu = com.tencent.mm.modelgeo.d.agz();
        aZt();
      }
      AppMethodBeat.o(88294);
      return;
      if ((com.tencent.mm.plugin.card.d.l.tn(i)) || (i == 0) || (i == 1) || (i == 3) || (i == 4) || (i == 9) || (i == 12) || (i == 15) || (i == 17) || (i == 21))
      {
        this.emC = i;
        this.kaE = getIntent().getStringExtra("key_card_id");
        this.kiP = getIntent().getStringExtra("key_card_ext");
        this.kcf = getIntent().getBooleanExtra("key_is_share_card", false);
        this.kiq = getIntent().getIntExtra("key_stastic_scene", 0);
        this.kit = getIntent().getStringExtra("key_consumed_card_id");
        if ((i == 7) || (i == 16))
        {
          this.kir = getIntent().getStringExtra("src_username");
          this.kis = getIntent().getStringExtra("js_url");
          this.fhu = getIntent().getStringExtra("key_template_id");
          break;
        }
        if ((this.kcf) && (i == 3))
        {
          this.kbQ = getIntent().getStringExtra("key_card_tp_id");
          this.kaE = com.tencent.mm.plugin.card.sharecard.a.b.dp(this.kaE, this.kbQ);
          break;
        }
        if (i != 8)
          break;
        this.kiV = getIntent().getBooleanExtra("key_is_sms_add_card", false);
        break;
      }
      if ((i == 50) || (i == 27))
      {
        this.emC = getIntent().getIntExtra("key_previous_scene", 50);
        if ((this.emC != 26) && (this.emC != 27))
          this.emC = 3;
        this.fhu = getIntent().getStringExtra("key_template_id");
        if (this.emC == 27)
        {
          localObject1 = (com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info");
          if (localObject1 != null)
          {
            this.kaS = ((com.tencent.mm.plugin.card.base.b)localObject1);
            this.kaE = this.kaS.aZZ();
            bck();
            bcn();
            if (this.kaS.aZQ())
              am.bbj().Gk(this.kaS.aZZ());
            bbB();
          }
          bcl();
          com.tencent.mm.plugin.card.d.l.beB();
        }
        else
        {
          localObject1 = com.tencent.mm.plugin.card.d.k.bR(getIntent().getStringExtra("card_list"), this.emC);
          if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0))
          {
            ab.e("MicroMsg.CardDetailUI", "initData tempList size is empty");
            n(true, -1);
          }
          while (true)
          {
            bck();
            break;
            fE(true);
            this.kaE = ((oj)((LinkedList)localObject1).get(0)).kbU;
            j = getIntent().getIntExtra("key_previous_scene", 51);
            localObject2 = new cdc();
            ((cdc)localObject2).xcM = this.fhu;
            ab.i("MicroMsg.CardDetailUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { this.fhu });
            localObject1 = new t((LinkedList)localObject1, (cdc)localObject2, j, this.kaE);
            com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject1, 0);
          }
        }
      }
      else if (i == 51)
      {
        if (getIntent().getIntExtra("key_previous_scene", 51) == 26);
        for (this.emC = 26; ; this.emC = 3)
        {
          this.kaE = getIntent().getStringExtra("key_card_id");
          this.kaS = am.bbb().kau;
          if (this.kaS == null)
            this.kaS = am.baW().Gu(this.kaE);
          bck();
          if (this.kaS != null)
            break label1582;
          ab.e("MicroMsg.CardDetailUI", "initData, mCardId is null from scene == ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_VIEW_UI");
          n(true, -1);
          break;
        }
        label1582: bcn();
        bbB();
        bcl();
        if (this.kaS.aZQ())
          am.bbj().Gk(this.kaS.aZZ());
      }
      else
      {
        if (i == 26)
        {
          this.emC = i;
          this.kaE = getIntent().getStringExtra("key_card_id");
          this.kiP = getIntent().getStringExtra("key_card_ext");
          break;
        }
        this.emC = i;
        localObject2 = getIntent().getStringExtra("key_card_app_msg");
        localObject1 = com.tencent.mm.plugin.card.d.g.Hi((String)localObject2);
        if (localObject1 != null)
        {
          this.kaE = ((com.tencent.mm.plugin.card.model.d)localObject1).cMC;
          this.kiN = ((com.tencent.mm.plugin.card.model.d)localObject1).kde;
          this.kiP = ((com.tencent.mm.plugin.card.model.d)localObject1).cMD;
        }
        this.kiO = com.tencent.mm.plugin.card.d.g.Hj((String)localObject2);
        break;
        label1729: if ((i == 2) || (i == 6) || ((i == 4) && (!this.kcf)) || (i == 5) || (i == 17) || (i == 21) || (i == 23))
          j = 1;
        while (true)
        {
          if ((j == 0) && (this.kaS != null))
            break label1956;
          ab.i("MicroMsg.CardDetailUI", "initData fail, isNeedDoNetScene1 is true or no cardinfo with cardId = " + this.kaE + " isShareCard is " + this.kcf);
          fE(true);
          if (!this.kcf)
            break label1949;
          bco();
          break;
          if (i == 15)
          {
            localObject1 = am.bbb().getValue("key_accept_card_info");
            if ((localObject1 != null) && ((localObject1 instanceof CardInfo)))
            {
              this.kaS = ((CardInfo)localObject1);
              j = 0;
            }
            else
            {
              j = 1;
            }
          }
          else if (this.kcf)
          {
            this.kaS = am.bbe().GK(this.kaE);
            j = 0;
          }
          else
          {
            this.kaS = am.baW().Gu(this.kaE);
            j = 0;
          }
        }
        label1949: bcm();
      }
    }
    label1956: ab.d("MicroMsg.CardDetailUI", "initData(), cardId = " + this.kaE);
    Object localObject1 = this.kaS.aZY();
    if (localObject1 != null)
    {
      this.kaY = new ArrayList();
      this.kaY.add(localObject1);
    }
    bbB();
    if (this.kaS.aZQ())
      am.bbj().Gk(this.kaS.aZZ());
    if (this.kcf)
    {
      this.kiW = true;
      j = 1;
      label2061: if (j == 0)
        break label2203;
      ab.i("MicroMsg.CardDetailUI", "initData fail, isNeedDoNetScene2 is true or no cardinfo with cardId = " + this.kaE + " isShareCard is " + this.kcf);
      if (!this.kcf)
        break label2196;
      bco();
    }
    while (true)
    {
      bcl();
      break;
      if ((int)(System.currentTimeMillis() / 1000L) - this.kaS.bac() >= 86400L);
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label2173;
        this.kiW = true;
        j = 1;
        break;
      }
      label2173: if (!this.kaS.aZN())
        break label2061;
      this.kiW = true;
      j = 1;
      break label2061;
      label2196: bcm();
      continue;
      label2203: bcn();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88287);
    super.onCreate(paramBundle);
    this.mStartTime = System.currentTimeMillis();
    bci();
    com.tencent.mm.plugin.card.b.d locald = am.bbh();
    paramBundle = this.mController.ylL;
    com.tencent.mm.kernel.g.RO().eJo.a(910, locald);
    am.bbd().a(locald);
    com.tencent.mm.plugin.card.b.b localb = am.baV();
    if (localb.kaD == null)
      localb.kaD = new ArrayList();
    localb.kaD.add(new WeakReference(locald));
    locald.atF = new WeakReference(paramBundle);
    am.bbh().a(this);
    am.bbi().a(this);
    paramBundle = am.bbj();
    com.tencent.mm.kernel.g.RO().eJo.a(577, paramBundle);
    paramBundle.kaF.clear();
    paramBundle.kaG = 0;
    am.bbj().a(this);
    initView();
    AppMethodBeat.o(88287);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88291);
    am.bbh().c(this);
    bcj();
    am.bbh().b(this);
    am.bbh().release();
    am.bbi().b(this);
    am.bbj().b(this);
    am.bbj().release();
    Object localObject1 = this.kiM;
    Object localObject2 = ((e)localObject1).kjy;
    ((com.tencent.mm.plugin.card.b.f)localObject2).kaS = null;
    ((com.tencent.mm.plugin.card.b.f)localObject2).kaW.clear();
    ((e)localObject1).kjy = null;
    localObject2 = ((e)localObject1).kjw;
    com.tencent.mm.plugin.card.d.l.K(((j)localObject2).kno);
    for (int i = ((j)localObject2).knv.size() - 1; i >= 0; i--)
      com.tencent.mm.plugin.card.d.l.K((Bitmap)((j)localObject2).knv.remove(i));
    ((j)localObject2).knv.clear();
    if (((j)localObject2).gKG.isShowing())
      ((j)localObject2).gKG.dismiss();
    ((j)localObject2).gKG = null;
    ((j)localObject2).bdq();
    ((j)localObject2).knn = null;
    ((j)localObject2).kaS = null;
    ((e)localObject1).kjw = null;
    if (((e)localObject1).kjj != null)
      ((e)localObject1).kjj.release();
    ((e)localObject1).kjd.ifE = null;
    com.tencent.mm.sdk.b.a.xxA.d(((e)localObject1).kjH);
    ((e)localObject1).kjf.destroy();
    ((e)localObject1).kji.destroy();
    ((e)localObject1).kjh.destroy();
    ((e)localObject1).kju.destroy();
    if (((e)localObject1).kjv != null)
      ((e)localObject1).kjv.destroy();
    if (((e)localObject1).kjn != null)
      ((e)localObject1).kjn.destroy();
    if (((e)localObject1).kjm != null)
      ((e)localObject1).kjm.destroy();
    if (((e)localObject1).kjo != null)
      ((e)localObject1).kjo.destroy();
    if (((e)localObject1).kjp != null)
      ((e)localObject1).kjp.destroy();
    if (((e)localObject1).kjq != null)
      ((e)localObject1).kjq.destroy();
    if (((e)localObject1).kjr != null)
      ((e)localObject1).kjr.destroy();
    if (((e)localObject1).kjs != null)
      ((e)localObject1).kjs.destroy();
    if (((e)localObject1).kjt != null)
      ((e)localObject1).kjt.destroy();
    if (((e)localObject1).kjk != null)
      ((e)localObject1).kjk.destroy();
    ((e)localObject1).kje = null;
    localObject2 = am.bbm();
    if (((com.tencent.mm.plugin.card.b.g)localObject2).kaD != null)
    {
      i = 0;
      if (i < ((com.tencent.mm.plugin.card.b.g)localObject2).kaD.size())
      {
        WeakReference localWeakReference = (WeakReference)((com.tencent.mm.plugin.card.b.g)localObject2).kaD.get(i);
        if (localWeakReference == null)
          break label686;
        g.a locala = (g.a)localWeakReference.get();
        if ((locala == null) || (!locala.equals(localObject1)))
          break label686;
        ((com.tencent.mm.plugin.card.b.g)localObject2).kaD.remove(localWeakReference);
      }
    }
    am.bbm().release();
    this.kgA.cancel();
    aZv();
    long l = System.currentTimeMillis() - this.mStartTime;
    if (this.kaS != null)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(13219, new Object[] { "CardDetailView", Integer.valueOf(this.emC), this.kaS.baa(), this.kaS.aZZ(), Long.valueOf(l) });
      label558: if (((this.kiQ) || (this.kiR)) && (this.kaS != null) && (this.kaS.aZC()))
      {
        if (!this.kaS.aZP())
          break label746;
        am.bbi().bM(this.kaE, 2);
      }
      label614: localObject2 = this.kja;
      ab.i("MicroMsg.CardLbsOrBluetooth", "uninit");
      if (((com.tencent.mm.plugin.card.b.i)localObject2).kbk != null)
      {
        localObject1 = ((com.tencent.mm.plugin.card.b.i)localObject2).kbk;
        if (((i.a)localObject1).hDr != null)
          break label760;
        ab.e("MicroMsg.CardLbsOrBluetooth", "bluetoothStateListener null, return");
      }
    }
    while (true)
    {
      ((com.tencent.mm.plugin.card.b.i)localObject2).kbk = null;
      ((com.tencent.mm.plugin.card.b.i)localObject2).baC();
      ((com.tencent.mm.plugin.card.b.i)localObject2).kbp = null;
      ((com.tencent.mm.plugin.card.b.i)localObject2).kbc = null;
      super.onDestroy();
      AppMethodBeat.o(88291);
      return;
      label686: i++;
      break;
      com.tencent.mm.plugin.report.service.h.pYm.e(13219, new Object[] { "CardDetailView", Integer.valueOf(this.emC), this.kaE, this.kaE, Long.valueOf(l) });
      break label558;
      label746: am.bbi().bM(this.kaE, 1);
      break label614;
      label760: ah.getContext().unregisterReceiver(((i.a)localObject1).hDr);
      ((i.a)localObject1).hDr = null;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(88305);
    if (paramInt == 4)
    {
      ab.e("MicroMsg.CardDetailUI", "onKeyDown finishUI");
      n(false, -1);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(88305);
    return bool;
  }

  public void onPause()
  {
    AppMethodBeat.i(88289);
    bcj();
    super.onPause();
    this.kiM.cAY = true;
    am.bbh().a(this, false);
    bc.a(this, null);
    com.tencent.mm.plugin.card.b.i locali = this.kja;
    if (locali.baF())
    {
      ab.i("MicroMsg.CardLbsOrBluetooth", "stop");
      if (locali.kbk != null)
        locali.kbk.baI();
      locali.baC();
      com.tencent.mm.kernel.g.RO().eJo.b(2574, locali);
    }
    AppMethodBeat.o(88289);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(88311);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.CardDetailUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(88311);
      return;
    }
    ab.i("MicroMsg.CardDetailUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 69:
    }
    while (true)
    {
      AppMethodBeat.o(88311);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        ab.i("MicroMsg.CardDetailUI", "onMPermissionGranted LocationPermissionGranted " + this.khx);
        if (!this.khx)
        {
          this.khx = true;
          bbN();
        }
        AppMethodBeat.o(88311);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131298419), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(88284);
          CardDetailUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          AppMethodBeat.o(88284);
        }
      }
      , null);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(88288);
    super.onResume();
    bci();
    if (this.fwu != null)
      this.fwu.a(this.ecy, true);
    this.kiM.cAY = false;
    bc.a(this, this);
    am.bbh().a(this, true);
    Object localObject;
    int i;
    if (((this.kiQ) || (this.kiR)) && (this.kaS.aZC()))
    {
      if (!this.kaS.aZP())
        break label224;
      am.bbi().bM(this.kaE, 2);
      localObject = am.bbh();
      String str = this.kaE;
      localObject = (Boolean)((com.tencent.mm.plugin.card.b.d)localObject).kaR.get(str);
      if ((localObject == null) || (!((Boolean)localObject).booleanValue()))
        break label208;
      i = 1;
      if ((i == 0) || (TextUtils.isEmpty(am.bbh().kaU)))
        break label213;
      ab.i("MicroMsg.CardDetailUI", "onResume, do launch succ UI!");
      Gm(am.bbh().kaU);
      label171: this.kiM.kjk.d(com.tencent.mm.plugin.card.d.c.krE);
    }
    while (true)
    {
      if (this.kja.bZi)
        this.kja.start();
      AppMethodBeat.o(88288);
      return;
      label208: i = 0;
      break;
      label213: ab.i("MicroMsg.CardDetailUI", "onResume, not need launch succ ui or jsonRet is empty!");
      break label171;
      label224: am.bbi().bM(this.kaE, 1);
      localObject = this.kiM.kjk;
      if (localObject != null)
        ((com.tencent.mm.plugin.card.ui.view.g)localObject).d(com.tencent.mm.plugin.card.d.c.krE);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(88298);
    ab.i("MicroMsg.CardDetailUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      fE(false);
      if ((paramm instanceof aa))
      {
        paramm = ((aa)paramm).kdS;
        if (TextUtils.isEmpty(paramm))
        {
          ab.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneGetCardItemInfo return json is null");
          AppMethodBeat.o(88298);
        }
      }
      while (true)
      {
        return;
        Object localObject = this.kaS;
        paramString = new CardInfo();
        com.tencent.mm.plugin.card.d.f.a((CardInfo)paramString, paramm);
        if (!TextUtils.isEmpty(paramString.aZZ()))
        {
          this.kaE = paramString.aZZ();
          label137: this.kaS = paramString;
          bcn();
          if (this.emC == 3)
          {
            if (localObject != null)
            {
              ((CardInfo)this.kaS).field_stickyAnnouncement = ((CardInfo)localObject).field_stickyAnnouncement;
              ((CardInfo)this.kaS).field_stickyEndTime = ((CardInfo)localObject).field_stickyEndTime;
              ((CardInfo)this.kaS).field_stickyIndex = ((CardInfo)localObject).field_stickyIndex;
              ((CardInfo)this.kaS).field_label_wording = ((CardInfo)localObject).field_label_wording;
              this.kaS.a(((com.tencent.mm.plugin.card.base.b)localObject).aZY());
            }
            if (!this.kiW)
              break label395;
            com.tencent.mm.plugin.card.d.l.h(this.kaS);
          }
        }
        while (true)
        {
          bbB();
          bcl();
          if (this.kaS.aZQ())
            am.bbj().Gk(this.kaS.aZZ());
          this.kja.a(this, this.kaE, this.kaS, this.ecs, this.ect);
          AppMethodBeat.o(88298);
          break;
          if ((!TextUtils.isEmpty(paramString.aZZ())) || (this.kaE.equals(paramString.baa())))
            break label137;
          ab.e("MicroMsg.CardDetailUI", "mCardId:%s, mCardTpId:%s is different, error", new Object[] { this.kaE, paramString.baa() });
          AppMethodBeat.o(88298);
          break;
          label395: ab.e("MicroMsg.CardDetailUI", "onSceneEnd(), NetSceneGetCardItemInfo updateDataToDB is false");
        }
        if ((paramm instanceof com.tencent.mm.plugin.card.model.o))
        {
          if (this.kgn == 26)
            fE(false);
          localObject = ((com.tencent.mm.plugin.card.model.o)paramm).kdS;
          paramInt1 = ((com.tencent.mm.plugin.card.model.o)paramm).kdT;
          paramm = ((com.tencent.mm.plugin.card.model.o)paramm).kdU;
          if (paramInt1 != 0)
            c(paramInt2, paramString, paramInt1, paramm);
          while (true)
          {
            if (!TextUtils.isEmpty((CharSequence)localObject))
              break label513;
            ab.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneAcceptCardItem return json is null");
            AppMethodBeat.o(88298);
            break;
            com.tencent.mm.ui.base.h.bQ(this, getResources().getString(2131297806));
          }
          label513: this.emC = 3;
          if (this.kaS == null)
            this.kaS = new CardInfo();
          com.tencent.mm.plugin.card.d.f.a((CardInfo)this.kaS, (String)localObject);
          if (!TextUtils.isEmpty(this.kaS.aZZ()))
            this.kaE = this.kaS.aZZ();
          if (this.kiM.bcS() == 1)
          {
            paramString = this.kiM;
            if (paramString.kjy != null)
            {
              paramString = paramString.kjy;
              if (paramString.kaX != null)
                paramString.kaX.kci = false;
            }
          }
          if (this.kgn != 26)
          {
            bcn();
            bbB();
          }
          com.tencent.mm.plugin.card.d.l.beB();
          paramString = this.kaS;
          if (paramString.aZD())
          {
            paramm = (Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xKw, Integer.valueOf(0));
            if ((paramm == null) || (paramm.intValue() != 1))
            {
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKw, Integer.valueOf(1));
              label704: if (!com.tencent.mm.plugin.card.d.l.beE())
                break label902;
              com.tencent.mm.plugin.card.d.d.c(this, 2130968982, 2131297803, paramString.aZV().kdf);
            }
            label729: this.kiZ = this.kaS.baf();
            if ((this.kgn != 7) && (this.kgn != 16))
              break label924;
            paramString = new Intent();
            paramString.putExtra("key_code", this.kiZ);
            setResult(-1, paramString);
            tb(-1);
          }
          while (true)
          {
            if (this.kaS.aZQ())
              am.bbj().Gk(this.kaS.aZZ());
            this.kja.a(this, this.kaE, this.kaS, this.ecs, this.ect);
            AppMethodBeat.o(88298);
            break;
            paramm = (Integer)com.tencent.mm.kernel.g.RP().Ry().get(282884, null);
            if ((paramm != null) && (paramm.intValue() == 1))
              break label729;
            com.tencent.mm.kernel.g.RP().Ry().set(282884, Integer.valueOf(1));
            break label704;
            label902: com.tencent.mm.plugin.card.d.d.c(this, 2130968981, 2131297802, paramString.aZV().kdf);
            break label729;
            label924: if ((!this.kiV) && (this.kgn == 8))
              n(true, -1);
            else if ((this.kgn == 26) && (paramInt1 == 0))
              n(true, -1);
          }
        }
        if ((paramm instanceof v))
        {
          this.kaY = ((v)paramm).keb;
          if ((this.kaS != null) && (this.kaY != null) && (this.kaY.size() > 0))
          {
            this.kaS.a((od)this.kaY.get(0));
            bbB();
            if (this.kaS.aZC())
            {
              paramString = am.bbe().GK(this.kaE);
              if (paramString != null)
              {
                paramString.a((od)this.kaY.get(0));
                am.bbe().c(paramString, new String[] { this.kaE });
              }
              AppMethodBeat.o(88298);
            }
            else
            {
              paramString = am.baW().Gu(this.kaE);
              if (paramString != null)
              {
                paramString.a((od)this.kaY.get(0));
                am.baW().c(paramString, new String[] { this.kaE });
              }
              AppMethodBeat.o(88298);
            }
          }
          else if ((this.kaS != null) && (this.kaY == null))
          {
            this.kaS.a(null);
            bbB();
            if (this.kaS.aZC())
            {
              paramString = am.bbe().GK(this.kaE);
              if (paramString != null)
              {
                paramString.a(null);
                am.bbe().c(paramString, new String[] { this.kaE });
              }
              AppMethodBeat.o(88298);
            }
            else
            {
              paramString = am.baW().Gu(this.kaE);
              if (paramString != null)
              {
                paramString.a(null);
                am.baW().c(paramString, new String[] { this.kaE });
              }
            }
          }
          else
          {
            AppMethodBeat.o(88298);
          }
        }
        else if ((paramm instanceof af))
        {
          paramInt1 = ((af)paramm).kdT;
          localObject = ((af)paramm).kdU;
          if (paramInt1 == 10000)
          {
            paramString = (String)localObject;
            if (TextUtils.isEmpty((CharSequence)localObject))
              paramString = getString(2131297856);
            com.tencent.mm.plugin.card.d.d.c(this, paramString);
            AppMethodBeat.o(88298);
          }
          else
          {
            this.kiP = ((af)paramm).cMD;
            fI(true);
            paramString = this.kaS.aZW();
            paramString.status = 3;
            this.kaS.a(paramString);
            com.tencent.mm.plugin.card.d.l.h(this.kaS);
            bbB();
            if (this.kgn == 3)
            {
              n(true, 2);
              AppMethodBeat.o(88298);
            }
            else
            {
              if (this.kgn == 15)
              {
                paramString = new qk();
                com.tencent.mm.sdk.b.a.xxA.m(paramString);
              }
              AppMethodBeat.o(88298);
            }
          }
        }
        else if ((paramm instanceof com.tencent.mm.plugin.card.model.r))
        {
          com.tencent.mm.ui.base.h.bQ(this, getResources().getString(2131297832));
          am.baV();
          com.tencent.mm.plugin.card.b.b.sO(4);
          n(true, 1);
          AppMethodBeat.o(88298);
        }
        else if ((paramm instanceof t))
        {
          paramString = (t)paramm;
          paramm = paramString.kdZ;
          if ((paramm != null) && (paramm.size() > 0))
          {
            paramm = (com.tencent.mm.plugin.card.base.b)paramm.get(0);
            if ((paramm != null) && (!this.kaE.equals(paramString.cardId)))
            {
              ab.e("MicroMsg.CardDetailUI", "mCardId:%s, mCardTpId:%s is different, error", new Object[] { this.kaE, paramString.cardId });
              AppMethodBeat.o(88298);
            }
            else
            {
              this.kaS = paramm;
              if (this.kaS != null)
              {
                this.kaE = this.kaS.aZZ();
                bcn();
                if (this.kaS.aZQ())
                  am.bbj().Gk(this.kaS.aZZ());
              }
              if (this.emC == 26)
                this.emC = 3;
              bbB();
            }
          }
          else
          {
            bcl();
            com.tencent.mm.plugin.card.d.l.beB();
            AppMethodBeat.o(88298);
          }
        }
        else if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.g))
        {
          localObject = ((com.tencent.mm.plugin.card.sharecard.model.g)paramm).kdS;
          paramInt1 = ((com.tencent.mm.plugin.card.sharecard.model.g)paramm).kdT;
          paramm = ((com.tencent.mm.plugin.card.sharecard.model.g)paramm).kdU;
          if (paramInt1 != 0)
          {
            paramString = paramm;
            if (TextUtils.isEmpty(paramm))
              paramString = getString(2131297794);
            com.tencent.mm.plugin.card.d.d.c(this, paramString);
            ab.e("MicroMsg.CardDetailUI", "NetSceneShareCardItem onSceneEnd, accept card error, ret_msg:%s", new Object[] { paramString });
            AppMethodBeat.o(88298);
          }
          else
          {
            com.tencent.mm.ui.base.h.bQ(this, getResources().getString(2131297798));
            if (TextUtils.isEmpty((CharSequence)localObject))
            {
              ab.e("MicroMsg.CardDetailUI", "NetSceneShareCardItem onSceneEnd, json is null");
              AppMethodBeat.o(88298);
            }
            else
            {
              this.emC = 3;
              if (this.kaS == null)
              {
                this.kaS = new ShareCardInfo();
                label1869: com.tencent.mm.plugin.card.d.f.a((ShareCardInfo)this.kaS, (String)localObject);
                paramString = (ShareCardInfo)this.kaS;
                if (!TextUtils.isEmpty((CharSequence)localObject))
                  break label2172;
                ab.e("MicroMsg.CardInfoParser", "parserShareCardItemEncryptCodeForSingle jsonContent is null");
                label1906: if (!TextUtils.isEmpty(this.kaS.aZZ()))
                  this.kaE = this.kaS.aZZ();
                if (TextUtils.isEmpty(this.kaS.bab()))
                  ((ShareCardInfo)this.kaS).field_from_username = com.tencent.mm.model.r.Yz();
                com.tencent.mm.plugin.card.d.l.a((ShareCardInfo)this.kaS);
                bcn();
                bbB();
                com.tencent.mm.plugin.card.d.l.beD();
                am.bbd().aVU();
                this.kiZ = this.kaS.baf();
                if ((this.kgn != 7) && (this.kgn != 16))
                  break label2276;
                paramString = new Intent();
                paramString.putExtra("key_code", this.kiZ);
                setResult(-1, paramString);
                tb(-1);
              }
              while (true)
              {
                while (true)
                {
                  paramString = (Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xKu, Integer.valueOf(0));
                  if ((paramString == null) || (paramString.intValue() != 1))
                  {
                    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKu, Integer.valueOf(1));
                    com.tencent.mm.plugin.card.d.d.c(this, 2130968984, 2131297976, "");
                  }
                  if (this.kaS.aZQ())
                    am.bbj().Gk(this.kaS.aZZ());
                  AppMethodBeat.o(88298);
                  break;
                  if (!(this.kaS instanceof CardInfo))
                    break label1869;
                  this.kaS = new ShareCardInfo();
                  break label1869;
                  try
                  {
                    label2172: paramm = new org/json/JSONObject;
                    paramm.<init>((String)localObject);
                    paramm = paramm.optJSONArray("card_list");
                    if (paramm == null)
                      break label1906;
                    paramString.kbY = paramm.optJSONObject(0).optString("encrypt_code");
                    paramm = new java/lang/StringBuilder;
                    paramm.<init>("encrypt_code:");
                    ab.i("MicroMsg.CardInfoParser", paramString.kbY);
                  }
                  catch (JSONException paramString)
                  {
                    ab.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
                    ab.e("MicroMsg.CardInfoParser", paramString.getMessage());
                  }
                }
                break label1906;
                label2276: if ((!this.kiV) && (this.kgn == 8))
                  n(true, -1);
              }
            }
          }
        }
        else if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.c))
        {
          String str = ((com.tencent.mm.plugin.card.sharecard.model.c)paramm).kdS;
          if (TextUtils.isEmpty(str))
          {
            ab.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneGetShareCard json is null");
            AppMethodBeat.o(88298);
          }
          else
          {
            paramString = this.kaS;
            this.kaS = new ShareCardInfo();
            paramm = (ShareCardInfo)this.kaS;
            if (TextUtils.isEmpty(str))
            {
              ab.e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
              label2386: if (paramString != null)
              {
                if (!TextUtils.isEmpty(paramString.bab()))
                  ((ShareCardInfo)this.kaS).field_from_username = ((ShareCardInfo)paramString).field_from_username;
                ((ShareCardInfo)this.kaS).field_app_id = ((ShareCardInfo)paramString).field_app_id;
                ((ShareCardInfo)this.kaS).field_consumer = ((ShareCardInfo)paramString).field_consumer;
                ((ShareCardInfo)this.kaS).field_share_time = ((ShareCardInfo)paramString).field_share_time;
                ((ShareCardInfo)this.kaS).field_updateTime = ((ShareCardInfo)paramString).field_updateTime;
                ((ShareCardInfo)this.kaS).field_begin_time = ((ShareCardInfo)paramString).field_begin_time;
                ((ShareCardInfo)this.kaS).field_end_time = ((ShareCardInfo)paramString).field_end_time;
                ((ShareCardInfo)this.kaS).field_block_mask = ((ShareCardInfo)paramString).field_block_mask;
                this.kaS.a(paramString.aZY());
                ((ShareCardInfo)this.kaS).field_categoryType = ((ShareCardInfo)paramString).field_categoryType;
                ((ShareCardInfo)this.kaS).field_itemIndex = ((ShareCardInfo)paramString).field_itemIndex;
                if (((ShareCardInfo)paramString).field_status != ((ShareCardInfo)this.kaS).field_status)
                {
                  ab.i("MicroMsg.CardDetailUI", "getsharecared return, the status is " + ((ShareCardInfo)this.kaS).field_status);
                  com.tencent.mm.plugin.card.sharecard.a.b.a(this, this.kaS);
                }
              }
              if (!TextUtils.isEmpty(this.kaS.aZZ()))
                this.kaE = this.kaS.aZZ();
              bbB();
              bcn();
              bcl();
              if (this.emC == 3)
              {
                if (!this.kiW)
                  break label2786;
                com.tencent.mm.plugin.card.d.l.h(this.kaS);
              }
            }
            while (true)
            {
              while (true)
              {
                if (this.kaS.aZQ())
                  am.bbj().Gk(this.kaS.aZZ());
                AppMethodBeat.o(88298);
                break;
                try
                {
                  localObject = new org/json/JSONObject;
                  ((JSONObject)localObject).<init>(str);
                  com.tencent.mm.plugin.card.d.f.a(paramm, (JSONObject)localObject);
                }
                catch (JSONException paramm)
                {
                  ab.printErrStackTrace("MicroMsg.CardInfoParser", paramm, "", new Object[0]);
                }
              }
              break label2386;
              label2786: ab.e("MicroMsg.CardDetailUI", "onSceneEnd() sharecard updateDataToDB is false");
            }
          }
        }
        else
        {
          if (!(paramm instanceof com.tencent.mm.plugin.card.sharecard.model.a))
            break;
          if (((com.tencent.mm.plugin.card.sharecard.model.a)paramm).kdT != 0)
          {
            com.tencent.mm.plugin.card.d.d.c(this, getString(2131297830));
            AppMethodBeat.o(88298);
          }
          else
          {
            ab.i("MicroMsg.CardDetailUI", "delete share card, card id is " + this.kaS.aZZ());
            com.tencent.mm.plugin.card.sharecard.a.b.a(this, this.kaS);
            com.tencent.mm.ui.base.h.bQ(this, getResources().getString(2131297832));
            am.bbd().bbr();
            n(true, -1);
            AppMethodBeat.o(88298);
          }
        }
      }
    }
    ab.e("MicroMsg.CardDetailUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2 + " cmd:" + paramm.getType());
    fE(false);
    if ((paramm instanceof af))
    {
      fI(false);
      paramInt1 = ((af)paramm).kdT;
      paramm = ((af)paramm).kdU;
      if (paramInt1 != 10000)
        break label3124;
      paramString = paramm;
      if (TextUtils.isEmpty(paramm))
        paramString = getString(2131297856);
    }
    label3124: 
    while (true)
    {
      paramm = paramString;
      if (TextUtils.isEmpty(paramString))
        paramm = getString(2131298016);
      Toast.makeText(this.mController.ylL, paramm, 0).show();
      AppMethodBeat.o(88298);
      break;
      if ((paramm instanceof com.tencent.mm.plugin.card.model.o))
      {
        tb(0);
        c(paramInt2, paramString, ((com.tencent.mm.plugin.card.model.o)paramm).kdT, ((com.tencent.mm.plugin.card.model.o)paramm).kdU);
        AppMethodBeat.o(88298);
        break;
      }
      if ((paramm instanceof v))
      {
        AppMethodBeat.o(88298);
        break;
      }
    }
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(88323);
    if ((this.kiM.kjk instanceof com.tencent.mm.plugin.card.ui.view.q))
    {
      ((com.tencent.mm.plugin.card.ui.view.q)this.kiM.kjk).knw = am.bbj().getCode();
      this.kiM.bbB();
    }
    ab.i("MicroMsg.CardDetailUI", "code get success");
    AppMethodBeat.o(88323);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardDetailUI
 * JD-Core Version:    0.6.2
 */