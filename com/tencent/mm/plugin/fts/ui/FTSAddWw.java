package com.tencent.mm.plugin.fts.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.b.a.u;
import com.tencent.mm.openim.b.n;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.protocal.protobuf.bgg;
import com.tencent.mm.protocal.protobuf.bvk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.e.b;
import com.tencent.mm.ui.q;
import java.util.List;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class FTSAddWw extends FTSBaseUI
{
  private String hcl = "";
  private long iYa;
  private String kPJ = "";
  private Dialog lud;
  private View mHF;
  private View mHG;
  private View mHH;
  private View mHI;
  private View mHJ;
  private View mHK;
  private View mHL;
  private ImageView mHM;
  private TextView mHN;
  private TextView mHO;
  private TextView mHP;
  private TextView mHQ;
  private TextView mHR;
  private boolean mHS;
  protected boolean mHT;
  private int mHU = 1;
  private FTSLocalPageRelevantView mHV;
  private c mHW;
  private int mHX;
  private int mHY;
  int mIa = -1;
  private bvk mIf;

  private void Nt(String paramString)
  {
    AppMethodBeat.i(61773);
    this.mHS = true;
    this.mHT = false;
    this.mHU = 1;
    if ((paramString == null) || (paramString.length() == 0) || (paramString.trim().length() == 0))
    {
      AppMethodBeat.o(61773);
      return;
    }
    if (Character.isDigit(paramString.charAt(0)));
    for (int i = 15; ; i = 3)
    {
      this.mIa = i;
      FTSAddWw.5 local5 = new FTSAddWw.5(this);
      this.mHX = 0;
      this.mHY = 0;
      com.tencent.mm.kernel.g.Rg().a(372, local5);
      paramString = new n(paramString);
      com.tencent.mm.kernel.g.Rg().a(paramString, 0);
      getString(2131297061);
      this.lud = h.b(this, getString(2131302814), true, new FTSAddWw.6(this, paramString, local5));
      AppMethodBeat.o(61773);
      break;
    }
  }

  private void bAN()
  {
    AppMethodBeat.i(61771);
    String str = this.mIf.jBB;
    if (bo.nullAsNil(str).length() > 0)
    {
      if (2 != this.mIf.wWh)
        break label254;
      this.mIa = 15;
    }
    while (true)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", str);
      localIntent.putExtra(e.b.yfT, this.mIf.wlF);
      if ((this.mIa == 15) && (2 == this.mIf.wWh))
        localIntent.putExtra("Contact_Search_Mobile", this.kPJ.trim());
      localIntent.putExtra("key_add_contact_openim_appid", this.mIf.fKh);
      localIntent.putExtra("Contact_Nick", this.mIf.jCH);
      localIntent.putExtra("Contact_PyInitial", this.mIf.wbs);
      localIntent.putExtra("Contact_QuanPin", this.mIf.wbt);
      localIntent.putExtra("Contact_Sex", this.mIf.guN);
      localIntent.putExtra("key_add_contact_custom_detail_visible", this.mIf.wWy.wKo);
      localIntent.putExtra("key_add_contact_custom_detail", this.mIf.wWy.naq);
      localIntent.putExtra("Contact_Scene", this.mIa);
      localIntent.putExtra("key_ww_add_session_id", this.hcl);
      localIntent.putExtra("add_more_friend_search_scene", 2);
      com.tencent.mm.bp.d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
      AppMethodBeat.o(61771);
      return;
      label254: if (1 == this.mIf.wWh)
        this.mIa = 1;
    }
  }

  private void bAO()
  {
    AppMethodBeat.i(61774);
    al.d(new FTSAddWw.7(this));
    AppMethodBeat.o(61774);
  }

  protected final d a(e parame)
  {
    AppMethodBeat.i(61765);
    if (this.mHW == null)
      this.mHW = new c(parame);
    parame = this.mHW;
    AppMethodBeat.o(61765);
    return parame;
  }

  public final void a(com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    AppMethodBeat.i(61766);
    if ((parama instanceof com.tencent.mm.plugin.fts.ui.a.a))
      if (System.currentTimeMillis() - this.iYa <= 1000L)
        AppMethodBeat.o(61766);
    while (true)
    {
      return;
      this.iYa = System.currentTimeMillis();
      this.kPJ = parama.mDz.mDY;
      Nt(parama.mDz.mDY);
      parama = new u();
      parama.eP(this.hcl);
      parama.cXR = 1L;
      parama.ajK();
      AppMethodBeat.o(61766);
    }
  }

  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(61767);
    super.a(paramString1, paramString2, paramList, paramb);
    this.mHS = false;
    AppMethodBeat.o(61767);
  }

  public final boolean aMo()
  {
    AppMethodBeat.i(61768);
    Nt(this.query);
    aqX();
    AppMethodBeat.o(61768);
    return true;
  }

  protected final void bAM()
  {
    AppMethodBeat.i(61769);
    super.bAM();
    this.mHG.setVisibility(8);
    AppMethodBeat.o(61769);
  }

  protected final void bAP()
  {
    AppMethodBeat.i(61762);
    super.bAP();
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(61755);
        paramAnonymousMenuItem = new u();
        paramAnonymousMenuItem.eP(FTSAddWw.a(FTSAddWw.this));
        paramAnonymousMenuItem.cXR = 2L;
        paramAnonymousMenuItem.ajK();
        FTSAddWw.this.finish();
        AppMethodBeat.o(61755);
        return true;
      }
    });
    AppMethodBeat.o(61762);
  }

  public final int getLayoutId()
  {
    return 2130969606;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(61764);
    u localu = new u();
    localu.eP(this.hcl);
    localu.cXR = 2L;
    localu.ajK();
    finish();
    AppMethodBeat.o(61764);
  }

  public void onClickBackBtn(View paramView)
  {
    AppMethodBeat.i(61761);
    super.onClickBackBtn(paramView);
    paramView = new u();
    paramView.eP(this.hcl);
    paramView.cXR = 2L;
    paramView.ajK();
    AppMethodBeat.o(61761);
  }

  public void onClickClearTextBtn(View paramView)
  {
    AppMethodBeat.i(61775);
    super.onClickClearTextBtn(paramView);
    if (!this.mIr.getFtsEditText().mLL.hasFocus())
    {
      this.mIr.getFtsEditText().bBo();
      showVKB();
    }
    AppMethodBeat.o(61775);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(61760);
    super.onCreate(paramBundle);
    this.hcl = com.tencent.xweb.util.d.x(System.currentTimeMillis().getBytes());
    com.tencent.mm.plugin.fts.a.e.mCM = aa.HP(16);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(2131820940), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    xE(this.mController.ylL.getResources().getColor(2131690310));
    dyb();
    setHint(this.mController.ylL.getResources().getString(2131298765));
    this.mHF = findViewById(2131824197);
    this.mHG = findViewById(2131824184);
    this.mHH = findViewById(2131824185);
    this.mHL = findViewById(2131824186);
    this.mHI = findViewById(2131824190);
    this.mHJ = findViewById(2131824192);
    this.mHK = findViewById(2131824193);
    this.mHV = ((FTSLocalPageRelevantView)findViewById(2131824196));
    this.mHM = ((ImageView)findViewById(2131824187));
    this.mHN = ((TextView)findViewById(2131824188));
    this.mHO = ((TextView)findViewById(2131824189));
    this.mHP = ((TextView)findViewById(2131824194));
    this.mHQ = ((TextView)findViewById(2131824191));
    this.mHR = ((TextView)findViewById(2131824195));
    try
    {
      paramBundle = ac.adL("webSearchBar").optString("wording");
      ab.i("MicroMsg.FTS.FTSAddFriendUI", "set searchNetworkTips %s", new Object[] { paramBundle });
      this.mHR.setText(paramBundle);
      label357: this.mController.contentView.postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(61753);
          FTSAddWw.this.mIr.getFtsEditText().bBo();
          FTSAddWw.this.mIr.getFtsEditText().bBn();
          AppMethodBeat.o(61753);
        }
      }
      , 128L);
      this.mHF.setOnClickListener(new FTSAddWw.2(this));
      AppMethodBeat.o(61760);
      return;
    }
    catch (Exception paramBundle)
    {
      break label357;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(61772);
    super.onDestroy();
    if ((this.mHS) && (!this.mHT))
      an.l(this.query, this.mHU, 3, 16);
    AppMethodBeat.o(61772);
  }

  public void onResume()
  {
    AppMethodBeat.i(61763);
    super.onResume();
    aa.cVe();
    AppMethodBeat.o(61763);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void stopSearch()
  {
    AppMethodBeat.i(61770);
    super.stopSearch();
    u localu = new u();
    localu.eP(this.hcl);
    localu.cXR = 3L;
    localu.ajK();
    this.mHG.setVisibility(8);
    AppMethodBeat.o(61770);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSAddWw
 * JD-Core Version:    0.6.2
 */