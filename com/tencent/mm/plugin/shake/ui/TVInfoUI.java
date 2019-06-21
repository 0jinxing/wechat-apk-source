package com.tencent.mm.plugin.shake.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.shake.e.a.a;
import com.tencent.mm.plugin.shake.e.c.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.aov;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;

public class TVInfoUI extends MMPreference
  implements com.tencent.mm.ai.f, x.a
{
  private long cvx;
  protected ProgressDialog ehJ = null;
  protected com.tencent.mm.ui.base.preference.f ehK;
  private TextView gne;
  private ImageView klm;
  private boolean qdh = false;
  private boolean qfD = false;
  private String qwB = "";
  private TextView qwC;
  private c.a qwD;
  private com.tencent.mm.plugin.shake.e.b qwE;

  private void a(c.a parama)
  {
    AppMethodBeat.i(24923);
    if (parama == null)
    {
      ab.e("MicroMsg.TVInfoUI", "refreshViewByProduct(), pd == null");
      finish();
      AppMethodBeat.o(24923);
      return;
    }
    this.gne.setText(parama.field_title);
    if (bo.isNullOrNil(parama.field_topic))
      this.qwC.setVisibility(8);
    while (true)
    {
      this.klm = ((ImageView)findViewById(2131828367));
      if (!bo.isNullOrNil(parama.field_playurl))
      {
        ImageView localImageView = (ImageView)findViewById(2131828368);
        localImageView.setVisibility(0);
        localImageView.setOnClickListener(new TVInfoUI.1(this, parama));
        this.klm.setOnClickListener(new TVInfoUI.2(this, parama));
      }
      addIconOptionMenu(0, 2130839555, new TVInfoUI.3(this));
      if ((!bo.isNullOrNil(parama.field_id)) && (!this.qfD) && (!getIntent().getBooleanExtra("key_TV_come_from_shake", false)))
      {
        int i = getIntent().getIntExtra("key_TV_getProductInfoScene", 0);
        ab.d("MicroMsg.TVInfoUI", "GetTVInfo id[%s], scene[%s]", new Object[] { parama.field_id, Integer.valueOf(i) });
        aw.Rg().a(new com.tencent.mm.plugin.shake.d.a.b(parama.field_id, i), 0);
        this.qfD = true;
      }
      this.klm.setVisibility(0);
      setBackBtn(new TVInfoUI.4(this));
      ab.v("MicroMsg.TVInfoUI", "start postToMainThread initBodyView");
      al.d(new TVInfoUI.5(this, parama));
      AppMethodBeat.o(24923);
      break;
      this.qwC.setText(parama.field_topic);
    }
  }

  private void chn()
  {
    AppMethodBeat.i(24924);
    this.cvx = getIntent().getLongExtra("key_TVInfoUI_chatting_msgId", 0L);
    if ((this.cvx > 0L) && (aw.RK()))
    {
      aw.ZK();
      bi localbi = com.tencent.mm.model.c.XO().jf(this.cvx);
      if (localbi.field_msgId > 0L)
      {
        localbi.jv(this.qwE.anJ());
        aw.ZK();
        com.tencent.mm.model.c.XO().a(this.cvx, localbi);
      }
    }
    AppMethodBeat.o(24924);
  }

  public final int JC()
  {
    return 2131165307;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(24925);
    ab.d("MicroMsg.TVInfoUI", "onPreferenceTreeClick item: [%s]", new Object[] { paramPreference.mKey });
    boolean bool;
    if ((this.qwD == null) || (this.qwD.qiL == null))
    {
      ab.e("MicroMsg.TVInfoUI", "tv == null || tv.actionlist == null");
      AppMethodBeat.o(24925);
      bool = false;
      return bool;
    }
    while (true)
    {
      try
      {
        int i = Integer.valueOf(paramPreference.mKey).intValue();
        int j = i / 100;
        int k = i % 100;
        ab.v("MicroMsg.TVInfoUI", "keyId=[%s], ii=[%s], jj=[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        if ((j < 0) || (j >= this.qwD.qiL.size()))
        {
          ab.w("MicroMsg.TVInfoUI", "index out of bounds, ii=[%s], list Size=[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(this.qwD.qiL.size()) });
          AppMethodBeat.o(24925);
          bool = false;
          break;
        }
        paramf = (com.tencent.mm.plugin.shake.e.a)this.qwD.qiL.get(j);
        if (paramf == null)
        {
          ab.w("MicroMsg.TVInfoUI", "actionList == null");
          AppMethodBeat.o(24925);
          bool = false;
          break;
        }
        if ((k < 0) || (k >= paramf.fPL.size()))
        {
          ab.w("MicroMsg.TVInfoUI", "index out of bounds, jj=[%s], actions Size=[%s]", new Object[] { Integer.valueOf(k), Integer.valueOf(paramf.fPL.size()) });
          AppMethodBeat.o(24925);
          bool = false;
          break;
        }
        paramf = (a.a)paramf.fPL.get(k);
        if (paramf == null)
        {
          ab.w("MicroMsg.TVInfoUI", "action == null");
          AppMethodBeat.o(24925);
          bool = false;
          break;
        }
        paramPreference = new java/lang/StringBuilder;
        paramPreference.<init>("action type:");
        ab.v("MicroMsg.TVInfoUI", paramf.type + ", target:" + paramf.qwN + ", targetDesc:" + paramf.qwP + ", targetDesc2:" + paramf.qwQ);
        if (paramf.type == 3)
        {
          paramPreference = new android/content/Intent;
          paramPreference.<init>();
          paramPreference.putExtra("rawUrl", paramf.qwN);
          paramPreference.putExtra("show_bottom", false);
          paramPreference.putExtra("geta8key_scene", 10);
          paramPreference.putExtra("srcUsername", paramf.qwQ);
          com.tencent.mm.plugin.shake.a.gkE.i(paramPreference, this);
          AppMethodBeat.o(24925);
          bool = true;
          break;
        }
        if (paramf.type != 4)
          break label665;
        aw.ZK();
        ad localad = com.tencent.mm.model.c.XM().aoO(paramf.qwN);
        if (localad == null)
          continue;
        paramPreference = new android/content/Intent;
        paramPreference.<init>();
        if ((!com.tencent.mm.n.a.jh(localad.field_type)) || (!localad.dsf()))
          break label630;
        z.aeR().qP(paramf.qwN);
        if (!paramf.qwP.equals("1"))
          break label630;
        paramPreference.putExtra("Chat_User", paramf.qwN);
        paramPreference.putExtra("finish_direct", true);
        com.tencent.mm.plugin.shake.a.gkE.d(paramPreference, this);
        continue;
      }
      catch (Exception paramf)
      {
        ab.e("MicroMsg.TVInfoUI", "onPreferenceTreeClick, [%s]", new Object[] { paramf.getMessage() });
        ab.printErrStackTrace("MicroMsg.TVInfoUI", paramf, "", new Object[0]);
        AppMethodBeat.o(24925);
        bool = false;
      }
      break;
      label630: paramPreference.putExtra("Contact_User", paramf.qwN);
      paramPreference.putExtra("force_get_contact", true);
      d.b(this, "profile", ".ui.ContactInfoUI", paramPreference);
      continue;
      label665: if (paramf.type == 5)
      {
        paramPreference = new com/tencent/mm/g/a/he;
        paramPreference.<init>();
        paramPreference.cBW.actionCode = 11;
        paramPreference.cBW.result = paramf.qwN;
        paramPreference.cBW.context = this;
        paramPreference.callback = null;
        com.tencent.mm.sdk.b.a.xxA.a(paramPreference, Looper.myLooper());
      }
      else if (paramf.type == 6)
      {
        paramPreference = new android/content/Intent;
        paramPreference.<init>();
        paramPreference.putExtra("key_product_id", paramf.qwN);
        paramPreference.putExtra("key_product_scene", 9);
        d.b(this, "product", ".ui.MallProductUI", paramPreference);
      }
    }
  }

  public final int aWi()
  {
    return 2130970972;
  }

  public final int getLayoutId()
  {
    return 2130970971;
  }

  public final void initView()
  {
    AppMethodBeat.i(24922);
    setMMTitle(2131302785);
    this.ehK = this.yCw;
    this.gne = ((TextView)findViewById(2131828370));
    this.qwC = ((TextView)findViewById(2131828369));
    String str1 = getIntent().getStringExtra("key_TV_xml");
    String str2 = str1;
    if (bo.isNullOrNil(str1))
    {
      byte[] arrayOfByte = getIntent().getByteArrayExtra("key_TV_xml_bytes");
      str2 = str1;
      if (arrayOfByte != null)
        str2 = new String(arrayOfByte);
    }
    ab.d("MicroMsg.TVInfoUI", "tvinfo xml : %s", new Object[] { str2 });
    this.qwD = com.tencent.mm.plugin.shake.e.c.WN(str2);
    if (this.qwD == null)
    {
      ab.e("MicroMsg.TVInfoUI", "initView(), tv == null");
      finish();
      AppMethodBeat.o(24922);
    }
    while (true)
    {
      return;
      a(this.qwD);
      AppMethodBeat.o(24922);
    }
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(24926);
    boolean bool;
    if (paramString != null)
      if (paramBitmap == null)
      {
        bool = true;
        ab.d("MicroMsg.TVInfoUI", "onGetPictureFinish pic, url = [%s], bitmap is null ? [%B]", new Object[] { paramString, Boolean.valueOf(bool) });
      }
    while (true)
    {
      try
      {
        TVInfoUI.7 local7 = new com/tencent/mm/plugin/shake/ui/TVInfoUI$7;
        local7.<init>(this, paramString, paramBitmap);
        al.d(local7);
        AppMethodBeat.o(24926);
        return;
        bool = false;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.TVInfoUI", "onGetPictureFinish : [%s]", new Object[] { paramString.getLocalizedMessage() });
        ab.printErrStackTrace("MicroMsg.TVInfoUI", paramString, "", new Object[0]);
        AppMethodBeat.o(24926);
        continue;
      }
      ab.e("MicroMsg.TVInfoUI", "onUpdate pic, url  is null ");
      AppMethodBeat.o(24926);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24918);
    super.onCreate(paramBundle);
    x.b(this);
    initView();
    AppMethodBeat.o(24918);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24921);
    x.c(this);
    super.onDestroy();
    AppMethodBeat.o(24921);
  }

  public void onPause()
  {
    AppMethodBeat.i(24920);
    aw.Rg().b(552, this);
    super.onPause();
    AppMethodBeat.o(24920);
  }

  public void onResume()
  {
    AppMethodBeat.i(24919);
    super.onResume();
    aw.Rg().a(552, this);
    AppMethodBeat.o(24919);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(24927);
    if (paramm == null)
    {
      ab.w("MicroMsg.TVInfoUI", "scene == null");
      AppMethodBeat.o(24927);
    }
    while (true)
    {
      return;
      if (paramm.getType() == 552)
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.TVInfoUI", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          Toast.makeText(this, 2131302786, 0).show();
          AppMethodBeat.o(24927);
        }
        else if (this.qwD == null)
        {
          ab.w("MicroMsg.TVInfoUI", "onSceneEnd tv == null");
          AppMethodBeat.o(24927);
        }
        else
        {
          paramString = (com.tencent.mm.plugin.shake.d.a.b)paramm;
          if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
          for (paramString = (aov)paramString.ehh.fsH.fsP; ; paramString = null)
          {
            if (paramString != null)
              break label181;
            ab.w("MicroMsg.TVInfoUI", "onSceneEnd tvInfo == null");
            AppMethodBeat.o(24927);
            break;
          }
          label181: if (paramString.vOt != null)
          {
            ab.d("MicroMsg.TVInfoUI", "onSceneEnd  tvInfo.DescriptionXML != null, res:" + paramString.vOt);
            paramString = com.tencent.mm.plugin.shake.e.c.WN(paramString.vOt);
            if ((this.qwD != null) && (this.qwD.field_xml != null) && (paramString != null) && (paramString.field_xml != null) && (!this.qwD.field_xml.equals(paramString.field_xml)))
            {
              this.qwD = paramString;
              a(this.qwD);
            }
          }
        }
      }
      else
        AppMethodBeat.o(24927);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.TVInfoUI
 * JD-Core Version:    0.6.2
 */