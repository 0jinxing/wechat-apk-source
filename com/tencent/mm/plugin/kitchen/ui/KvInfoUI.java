package com.tencent.mm.plugin.kitchen.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.report.service.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.picker.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KvInfoUI extends MMActivity
{
  private c gLj;
  private Button grC;
  private MMSwitchBtn ixT;
  private ArrayAdapter lOF;
  private EditText nHf;
  private Button nHg;
  private ListView nHh;
  private TextView nHi;
  private String nHj;

  private void PC(String paramString)
  {
    AppMethodBeat.i(114450);
    ab.i("MicroMsg.KvInfoUI", "updateData new[%s] old[%s]", new Object[] { paramString, this.nHj });
    this.nHj = paramString;
    paramString = (List)j.cgu().pYD.get(this.nHj);
    if (paramString != null)
    {
      this.nHi.setText(this.nHj + ":" + paramString.size());
      this.lOF.setNotifyOnChange(false);
      this.lOF.clear();
      this.lOF.addAll(paramString);
      this.lOF.notifyDataSetChanged();
      AppMethodBeat.o(114450);
    }
    while (true)
    {
      return;
      this.nHi.setText(this.nHj + ":0");
      this.lOF.clear();
      AppMethodBeat.o(114450);
    }
  }

  public final int getLayoutId()
  {
    return 2130969914;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(114449);
    super.onCreate(paramBundle);
    setMMTitle("Debug show kv log");
    setBackBtn(new KvInfoUI.1(this));
    this.nHf = ((EditText)findViewById(2131825200));
    this.nHi = ((TextView)findViewById(2131825203));
    this.nHg = ((Button)findViewById(2131825201));
    this.nHg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(114442);
        paramAnonymousView = j.cgu().pYD;
        if ((paramAnonymousView != null) && (paramAnonymousView.size() > 0))
        {
          paramAnonymousView = new ArrayList(paramAnonymousView.keySet());
          b localb = new b(KvInfoUI.this.mController.ylL, paramAnonymousView);
          localb.Qq(0);
          localb.zSq = new KvInfoUI.2.1(this, localb, paramAnonymousView);
          localb.Qp(a.fromDPToPix(KvInfoUI.this.mController.ylL, 288));
          localb.show();
        }
        AppMethodBeat.o(114442);
      }
    });
    this.ixT = ((MMSwitchBtn)findViewById(2131825202));
    this.ixT.setCheck(j.cgu().pWV);
    this.ixT.setSwitchListener(new KvInfoUI.3(this));
    this.grC = ((Button)findViewById(2131820999));
    this.grC.setOnClickListener(new KvInfoUI.4(this));
    this.nHh = ((ListView)findViewById(2131825204));
    this.lOF = new KvInfoUI.5(this, this);
    this.nHh.setAdapter(this.lOF);
    this.nHh.setOnItemClickListener(new KvInfoUI.6(this));
    AppMethodBeat.o(114449);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(114451);
    if (this.lOF != null)
    {
      this.lOF.setNotifyOnChange(false);
      this.lOF.clear();
    }
    if (this.gLj != null)
      this.gLj.dismiss();
    aqX();
    super.onDestroy();
    AppMethodBeat.o(114451);
  }

  public void onResume()
  {
    AppMethodBeat.i(114452);
    if (!bo.isNullOrNil(this.nHj))
      PC(this.nHj);
    super.onResume();
    AppMethodBeat.o(114452);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.kitchen.ui.KvInfoUI
 * JD-Core Version:    0.6.2
 */