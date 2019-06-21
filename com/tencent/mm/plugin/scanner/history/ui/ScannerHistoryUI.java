package com.tencent.mm.plugin.scanner.history.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.scanner.a.j;
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.q;

public class ScannerHistoryUI extends MMActivity
{
  private View Ek;
  private LinearLayout knA;
  private View knB;
  private TextView knC;
  private ListView mListView;
  private a pZf;

  private void bbB()
  {
    AppMethodBeat.i(80816);
    if (com.tencent.mm.plugin.scanner.e.cgy().cgC().getCount() > 0)
    {
      this.mListView.setVisibility(0);
      this.Ek.setVisibility(8);
      this.knB.setVisibility(0);
      enableOptionMenu(true);
    }
    while (true)
    {
      this.pZf.notifyDataSetChanged();
      AppMethodBeat.o(80816);
      return;
      this.mListView.setVisibility(8);
      this.Ek.setVisibility(0);
      this.knB.setVisibility(8);
      enableOptionMenu(false);
    }
  }

  public final int getLayoutId()
  {
    return 2130970545;
  }

  public final void initView()
  {
    AppMethodBeat.i(80815);
    setMMTitle(2131302742);
    setBackBtn(new ScannerHistoryUI.1(this));
    this.mListView = ((ListView)findViewById(2131827208));
    this.knA = ((LinearLayout)View.inflate(getBaseContext(), 2130970544, null));
    this.mListView.addHeaderView(this.knA);
    this.pZf = new a();
    this.mListView.setAdapter(this.pZf);
    this.mListView.setOnItemClickListener(new ScannerHistoryUI.2(this));
    this.mListView.setOnItemLongClickListener(new ScannerHistoryUI.3(this));
    addTextOptionMenu(0, getString(2131297812), new ScannerHistoryUI.4(this));
    this.Ek = findViewById(2131821926);
    this.knB = View.inflate(this, 2130970543, null);
    if (this.knA != null)
      this.knA.addView(this.knB);
    this.knC = ((TextView)this.knB.findViewById(2131827207));
    this.knC.setText(2131300532);
    bbB();
    AppMethodBeat.o(80815);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(80812);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(80812);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(80814);
    super.onDestroy();
    AppMethodBeat.o(80814);
  }

  public void onResume()
  {
    AppMethodBeat.i(80813);
    super.onResume();
    AppMethodBeat.o(80813);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends p<com.tencent.mm.plugin.scanner.history.a.a>
  {
    public a()
    {
      super(new com.tencent.mm.plugin.scanner.history.a.a());
      AppMethodBeat.i(80807);
      pN(true);
      AppMethodBeat.o(80807);
    }

    public final void KC()
    {
      AppMethodBeat.i(80808);
      setCursor(com.tencent.mm.plugin.scanner.e.cgy().cgC().baR());
      notifyDataSetChanged();
      AppMethodBeat.o(80808);
    }

    public final void KD()
    {
      AppMethodBeat.i(80809);
      bIf();
      KC();
      AppMethodBeat.o(80809);
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(80810);
      Object localObject = (com.tencent.mm.plugin.scanner.history.a.a)getItem(paramInt);
      if (paramView == null)
      {
        paramView = View.inflate(ScannerHistoryUI.this.mController.ylL, 2130970542, null);
        paramViewGroup = new ScannerHistoryUI.b(ScannerHistoryUI.this, (byte)0);
        paramViewGroup.iNr = ((ImageView)paramView.findViewById(2131823474));
        paramViewGroup.kne = ((TextView)paramView.findViewById(2131823564));
        paramViewGroup.knf = ((TextView)paramView.findViewById(2131824074));
        paramViewGroup.kng = ((TextView)paramView.findViewById(2131826209));
        paramView.setTag(paramViewGroup);
        o.a locala = j.cV(((com.tencent.mm.plugin.scanner.history.a.a)localObject).field_xmlContent, ((com.tencent.mm.plugin.scanner.history.a.a)localObject).field_funcType);
        paramViewGroup.kne.setText(locala.field_title);
        long l = ((com.tencent.mm.plugin.scanner.history.a.a)localObject).field_ScanTime;
        paramViewGroup.knf.setText(h.c(ScannerHistoryUI.this, l, true));
        paramViewGroup.kng.setText(locala.field_subtitle);
        int i = ScannerHistoryUI.this.getResources().getDimensionPixelSize(2131428614);
        paramViewGroup.iNr.setImageResource(2130839830);
        ab.d("MicroMsg.ScannerHistoryUI", "ScannerHistoryUI getView () position : " + paramInt + " logo_url :  " + locala.field_thumburl);
        if (TextUtils.isEmpty(locala.field_thumburl))
          break label427;
        c.a locala1 = new c.a();
        locala1.ePK = com.tencent.mm.compatible.util.e.eSn;
        o.ahq();
        locala1.ePY = null;
        com.tencent.mm.plugin.scanner.e locale = com.tencent.mm.plugin.scanner.e.cgy();
        localObject = locala.field_thumburl;
        if (!com.tencent.mm.kernel.g.RK())
          break label419;
        localObject = String.format("%s/scanbook_%s", new Object[] { locale.eJM + "image/scan/img", com.tencent.mm.a.g.x(((String)localObject).getBytes()) });
        label331: locala1.ePJ = ((String)localObject);
        locala1.ePH = true;
        locala1.eQf = false;
        locala1.ePF = true;
        locala1.ePO = i;
        locala1.ePN = i;
        locala1.ePT = 2130839830;
        localObject = locala1.ahG();
        o.ahp().a(locala.field_thumburl, paramViewGroup.iNr, (c)localObject);
      }
      while (true)
      {
        AppMethodBeat.o(80810);
        return paramView;
        paramViewGroup = (ScannerHistoryUI.b)paramView.getTag();
        break;
        label419: localObject = "";
        break label331;
        label427: paramViewGroup.iNr.setImageResource(2130839830);
      }
    }
  }

  final class b
  {
    ImageView iNr;
    TextView kne;
    TextView knf;
    TextView kng;

    private b()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI
 * JD-Core Version:    0.6.2
 */