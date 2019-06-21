package com.tencent.mm.plugin.readerapp.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.i;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.bm;
import com.tencent.mm.model.u;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

@i
public class ReaderAppUI extends MMActivity
{
  private static float density;
  private int cJB;
  private View gwR;
  private com.tencent.mm.ui.widget.b.a jMO;
  private n.d jOb;
  private String nNr;
  private ListView ooS;
  private MMPullDownView ooW;
  private a<String> pFe;
  private e pFf;
  private int pFg;
  private b pFh;

  public ReaderAppUI()
  {
    AppMethodBeat.i(76845);
    this.cJB = 0;
    this.nNr = "";
    this.pFf = null;
    this.pFg = 0;
    this.jOb = new ReaderAppUI.2(this);
    AppMethodBeat.o(76845);
  }

  private PackageInfo VA(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(76854);
    if (paramString.length() == 0)
    {
      AppMethodBeat.o(76854);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = this.mController.ylL.getPackageManager().getPackageInfo(paramString, 0);
        AppMethodBeat.o(76854);
      }
      catch (PackageManager.NameNotFoundException paramString)
      {
        ab.printErrStackTrace("MicroMsg.ReaderAppUI", paramString, "", new Object[0]);
        AppMethodBeat.o(76854);
        paramString = localObject;
      }
    }
  }

  private void aP(Context paramContext, String paramString)
  {
    AppMethodBeat.i(76851);
    try
    {
      paramContext = bo.convertStreamToString(paramContext.getAssets().open(paramString));
      paramString = new com/tencent/mm/pluginsdk/ui/e;
      paramString.<init>(paramContext);
      this.pFf = paramString;
      AppMethodBeat.o(76851);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ReaderAppUI", paramContext, "", new Object[0]);
        AppMethodBeat.o(76851);
      }
    }
  }

  public final View.OnClickListener a(bl parambl, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(76853);
    b localb = this.pFh;
    String str = parambl.getTitle();
    Object localObject;
    if (!bo.isNullOrNil(paramString))
    {
      if (!localb.pFx.containsKey(paramString))
        break label92;
      localObject = (Set)localb.pFx.get(paramString);
    }
    while (true)
    {
      if (!bo.isNullOrNil(str))
        ((Set)localObject).add(str);
      parambl = new ReaderAppUI.9(this, paramInt1, paramString, parambl, paramInt2);
      AppMethodBeat.o(76853);
      return parambl;
      label92: localObject = new HashSet();
      localb.pFx.put(paramString, localObject);
    }
  }

  public final int getLayoutId()
  {
    return 2130970444;
  }

  public final void initView()
  {
    AppMethodBeat.i(76852);
    aP(this, "chatting/purecolor_chat.xml");
    this.ooS = ((ListView)findViewById(2131826816));
    this.ooW = ((MMPullDownView)findViewById(2131826815));
    this.gwR = getLayoutInflater().inflate(2130970448, null);
    this.ooS.addHeaderView(this.gwR);
    ((TextView)findViewById(2131821807)).setText(2131302141);
    if (this.cJB == 20)
      this.pFe = new ReaderAppUI.a(this, this, "");
    label373: 
    while (true)
    {
      this.ooS.setOnScrollListener(this.pFe);
      this.ooS.setAdapter(this.pFe);
      this.ooS.setTranscriptMode(0);
      registerForContextMenu(this.ooS);
      this.jMO = new com.tencent.mm.ui.widget.b.a(this);
      if (this.pFe.getCount() == 0)
      {
        Intent localIntent = new Intent(this, ReaderAppIntroUI.class);
        localIntent.putExtra("type", this.cJB);
        startActivity(localIntent);
        finish();
        AppMethodBeat.o(76852);
      }
      while (true)
      {
        return;
        if (this.cJB != 11)
          break label373;
        this.pFe = new ReaderAppUI.c(this, this, "");
        break;
        this.ooW.setOnTopLoadDataListener(new ReaderAppUI.3(this));
        this.ooW.setTopViewVisible(true);
        this.ooW.setAtBottomCallBack(new ReaderAppUI.4(this));
        this.ooW.setAtTopCallBack(new ReaderAppUI.5(this));
        this.ooW.setIsBottomShowAll(true);
        this.pFe.a(new ReaderAppUI.6(this));
        setBackBtn(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            AppMethodBeat.i(76819);
            ReaderAppUI.this.finish();
            AppMethodBeat.o(76819);
            return true;
          }
        });
        addIconOptionMenu(0, 2131296394, 2131230758, new ReaderAppUI.8(this));
        this.ooS.setSelection(this.pFe.getShowCount() - 1 + this.ooS.getHeaderViewsCount());
        AppMethodBeat.o(76852);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(76846);
    super.onCreate(paramBundle);
    this.cJB = getIntent().getIntExtra("type", 0);
    ab.i("MicroMsg.ReaderAppUI", "[onCreate] readerType:%s", new Object[] { Integer.valueOf(this.cJB) });
    this.cJB = 20;
    density = com.tencent.mm.bz.a.getDensity(this);
    this.pFh = new b();
    long l = System.currentTimeMillis();
    initView();
    ab.i("MicroMsg.ReaderAppUI", "[initView] cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    this.nNr = bl.kG(this.cJB);
    if ((20 == this.cJB) && (u.ac("newsapp", null) > 0))
      h.pYm.e(13440, new Object[] { Integer.valueOf(2) });
    AppMethodBeat.o(76846);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(76847);
    if (this.pFe != null)
    {
      this.pFe.bIf();
      this.pFe.dww();
    }
    if (this.pFh != null)
    {
      b localb = this.pFh;
      if (!localb.pFx.isEmpty())
      {
        Iterator localIterator1 = localb.pFx.entrySet().iterator();
        while (localIterator1.hasNext())
        {
          Object localObject = (Map.Entry)localIterator1.next();
          String str = (String)((Map.Entry)localObject).getKey();
          StringBuilder localStringBuilder = new StringBuilder();
          Iterator localIterator2 = ((Set)((Map.Entry)localObject).getValue()).iterator();
          while (localIterator2.hasNext())
          {
            localObject = (String)localIterator2.next();
            if (localStringBuilder.length() <= 0)
              localStringBuilder.append((String)localObject);
            else
              localStringBuilder.append("||").append((String)localObject);
          }
          h.pYm.e(15413, new Object[] { Integer.valueOf(9), str, localStringBuilder.toString() });
        }
        localb.pFx.clear();
      }
    }
    super.onDestroy();
    AppMethodBeat.o(76847);
  }

  public void onPause()
  {
    AppMethodBeat.i(76849);
    super.onPause();
    ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().jO("");
    com.tencent.mm.plugin.readerapp.c.g.cdZ().d(this.pFe);
    ((j)com.tencent.mm.kernel.g.K(j.class)).XR().apb(this.nNr);
    AppMethodBeat.o(76849);
  }

  public void onResume()
  {
    AppMethodBeat.i(76848);
    super.onResume();
    if (this.cJB == 20)
      setMMTitle(2131300497);
    while (true)
    {
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().jO(this.nNr);
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancelNotification(this.nNr);
      ((j)com.tencent.mm.kernel.g.K(j.class)).XR().apb(this.nNr);
      com.tencent.mm.plugin.readerapp.c.g.cdZ().c(this.pFe);
      this.pFe.a(null, null);
      refresh();
      AppMethodBeat.o(76848);
      return;
      setMMTitle(2131300500);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void refresh()
  {
    AppMethodBeat.i(76850);
    TextView localTextView = (TextView)findViewById(2131821807);
    int i;
    if (this.cJB == 20)
    {
      i = 2131302149;
      localTextView.setText(i);
      if (this.pFe.getCount() != 0)
        break label64;
      localTextView.setVisibility(0);
      AppMethodBeat.o(76850);
    }
    while (true)
    {
      return;
      i = 2131302155;
      break;
      label64: localTextView.setVisibility(8);
      AppMethodBeat.o(76850);
    }
  }

  static final class b
  {
    HashMap<String, Set<String>> pFx;

    public b()
    {
      AppMethodBeat.i(76838);
      this.pFx = new HashMap();
      AppMethodBeat.o(76838);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI
 * JD-Core Version:    0.6.2
 */