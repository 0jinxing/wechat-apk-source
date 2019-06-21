package com.tencent.mm.pluginsdk.cmd;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RecoveryConsoleUI extends MMActivity
  implements AdapterView.OnItemClickListener
{
  ListView Ej;
  List<Map<String, String>> kSg;
  List<b.a> vaC;
  SimpleAdapter vaD;

  public final int getLayoutId()
  {
    return 2130970193;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(79197);
    super.onCreate(paramBundle);
    setTitle("Recovery Console");
    this.vaC = b.dgV();
    this.kSg = new ArrayList(this.vaC.size());
    paramBundle = this.vaC.iterator();
    while (paramBundle.hasNext())
    {
      b.a locala = (b.a)paramBundle.next();
      HashMap localHashMap = new HashMap();
      localHashMap.put("title", getString(locala.vaH));
      this.kSg.add(localHashMap);
    }
    this.vaD = new SimpleAdapter(this, this.kSg, 2130970127, new String[] { "title" }, new int[] { 16908310 });
    this.Ej = ((ListView)findViewById(16908298));
    this.Ej.setAdapter(this.vaD);
    this.Ej.setOnItemClickListener(this);
    AppMethodBeat.o(79197);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(79198);
    paramAdapterView = (b.a)this.vaC.get(paramInt);
    if (paramAdapterView.vaI != null)
    {
      paramAdapterView.vaI.a(this, paramAdapterView.cSD.split(" +"), "");
      AppMethodBeat.o(79198);
    }
    while (true)
    {
      return;
      b.B(this, paramAdapterView.cSD, "");
      AppMethodBeat.o(79198);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.cmd.RecoveryConsoleUI
 * JD-Core Version:    0.6.2
 */