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
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.api.j;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.List;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class FTSAddFriendUI extends FTSBaseUI
{
  private final com.tencent.mm.ai.f ehi;
  private long iYa;
  private long ijU;
  private buv lPE;
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
  private int mHU;
  private FTSLocalPageRelevantView mHV;
  private c mHW;
  private int mHX;
  private int mHY;
  private String mHZ;
  int mIa;

  public FTSAddFriendUI()
  {
    AppMethodBeat.i(61733);
    this.mHU = 1;
    this.ehi = new FTSAddFriendUI.5(this);
    this.mIa = -1;
    AppMethodBeat.o(61733);
  }

  private void Nt(String paramString)
  {
    AppMethodBeat.i(61745);
    this.mHS = true;
    this.mHT = false;
    this.mHU = 1;
    if ((paramString == null) || (paramString.length() == 0) || (paramString.trim().length() == 0))
    {
      AppMethodBeat.o(61745);
      return;
    }
    if (Character.isDigit(paramString.charAt(0)));
    for (int i = 15; ; i = 3)
    {
      this.mIa = i;
      this.mHX = 0;
      this.mHY = 0;
      com.tencent.mm.kernel.g.Rg().a(106, this.ehi);
      paramString = new com.tencent.mm.plugin.messenger.a.f(paramString, 3);
      com.tencent.mm.kernel.g.Rg().a(paramString, 0);
      getString(2131297061);
      this.lud = h.b(this, getString(2131302814), true, new FTSAddFriendUI.6(this, paramString));
      AppMethodBeat.o(61745);
      break;
    }
  }

  private void bAN()
  {
    AppMethodBeat.i(61743);
    if (bo.nullAsNil(com.tencent.mm.platformtools.aa.a(this.lPE.wcB)).length() > 0)
    {
      if (2 != this.lPE.wWh)
        break label129;
      this.mIa = 15;
    }
    while (true)
    {
      Intent localIntent = new Intent();
      ((j)com.tencent.mm.kernel.g.K(j.class)).a(localIntent, this.lPE, this.mIa);
      if ((this.mIa == 15) && (2 == this.lPE.wWh))
        localIntent.putExtra("Contact_Search_Mobile", this.mHZ);
      localIntent.putExtra("add_more_friend_search_scene", 2);
      com.tencent.mm.bp.d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
      AppMethodBeat.o(61743);
      return;
      label129: if (1 == this.lPE.wWh)
        this.mIa = 1;
    }
  }

  private void bAO()
  {
    AppMethodBeat.i(61746);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(61732);
        if (FTSAddFriendUI.k(FTSAddFriendUI.this) != null)
        {
          FTSAddFriendUI.k(FTSAddFriendUI.this).dismiss();
          FTSAddFriendUI.j(FTSAddFriendUI.this);
        }
        AppMethodBeat.o(61732);
      }
    });
    AppMethodBeat.o(61746);
  }

  protected final d a(e parame)
  {
    AppMethodBeat.i(61737);
    if (this.mHW == null)
      this.mHW = new c(parame);
    parame = this.mHW;
    AppMethodBeat.o(61737);
    return parame;
  }

  public final void a(com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    AppMethodBeat.i(61738);
    if ((parama instanceof com.tencent.mm.plugin.fts.ui.a.a))
      if (System.currentTimeMillis() - this.iYa <= 1000L)
        AppMethodBeat.o(61738);
    while (true)
    {
      return;
      this.iYa = System.currentTimeMillis();
      Nt(parama.mDz.mDY);
      AppMethodBeat.o(61738);
    }
  }

  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(61739);
    super.a(paramString1, paramString2, paramList, paramb);
    this.mHS = false;
    AppMethodBeat.o(61739);
  }

  public final boolean aMo()
  {
    AppMethodBeat.i(61740);
    Nt(this.query);
    aqX();
    AppMethodBeat.o(61740);
    return true;
  }

  protected final void bAM()
  {
    AppMethodBeat.i(61741);
    super.bAM();
    this.mHG.setVisibility(8);
    AppMethodBeat.o(61741);
  }

  public final int getLayoutId()
  {
    return 2130969606;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(61736);
    finish();
    AppMethodBeat.o(61736);
  }

  public void onClickClearTextBtn(View paramView)
  {
    AppMethodBeat.i(61747);
    super.onClickClearTextBtn(paramView);
    if (!this.mIr.getFtsEditText().mLL.hasFocus())
    {
      this.mIr.getFtsEditText().bBo();
      showVKB();
    }
    AppMethodBeat.o(61747);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(61734);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.fts.a.e.mCM = com.tencent.mm.plugin.websearch.api.aa.HP(16);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(2131820940), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    xE(this.mController.ylL.getResources().getColor(2131690310));
    setHint(this.mController.ylL.getResources().getString(2131298757));
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
      label326: this.mController.contentView.postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(61725);
          FTSAddFriendUI.this.mIr.getFtsEditText().bBo();
          FTSAddFriendUI.this.mIr.getFtsEditText().bBn();
          AppMethodBeat.o(61725);
        }
      }
      , 128L);
      this.mHF.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(61726);
          FTSAddFriendUI.this.finish();
          AppMethodBeat.o(61726);
        }
      });
      AppMethodBeat.o(61734);
      return;
    }
    catch (Exception paramBundle)
    {
      break label326;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(61744);
    super.onDestroy();
    com.tencent.mm.kernel.g.Rg().b(106, this.ehi);
    if ((this.mHS) && (!this.mHT))
      an.l(this.query, this.mHU, 3, 16);
    AppMethodBeat.o(61744);
  }

  public void onResume()
  {
    AppMethodBeat.i(61735);
    super.onResume();
    com.tencent.mm.plugin.websearch.api.aa.cVe();
    AppMethodBeat.o(61735);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void stopSearch()
  {
    AppMethodBeat.i(61742);
    super.stopSearch();
    this.mHG.setVisibility(8);
    AppMethodBeat.o(61742);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSAddFriendUI
 * JD-Core Version:    0.6.2
 */