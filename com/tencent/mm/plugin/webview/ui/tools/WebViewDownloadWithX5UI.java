package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;

@com.tencent.mm.ui.base.a(2)
public class WebViewDownloadWithX5UI extends MMActivity
{
  private Context mContext;
  private Button utd;
  private final com.tencent.mm.plugin.webview.modeltools.a utt;

  public WebViewDownloadWithX5UI()
  {
    AppMethodBeat.i(7617);
    this.utt = new com.tencent.mm.plugin.webview.modeltools.a();
    AppMethodBeat.o(7617);
  }

  public final int getLayoutId()
  {
    return 2130971212;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(7620);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (com.tencent.mm.plugin.webview.modeltools.a.d(this, paramInt1, paramInt2, paramIntent))
    {
      if (-1 == paramInt2)
        finish();
      AppMethodBeat.o(7620);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(7620);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7618);
    super.onCreate(paramBundle);
    this.mContext = this;
    setMMTitle(getString(2131305547));
    setBackBtn(new WebViewDownloadWithX5UI.1(this));
    overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
    this.utd = ((Button)findViewById(2131829167));
    ImageView localImageView = (ImageView)findViewById(2131829164);
    TextView localTextView = (TextView)findViewById(2131829165);
    String str1 = getIntent().getStringExtra("task_url");
    String str2 = getIntent().getStringExtra("title");
    long l = getIntent().getLongExtra("task_size", 0L);
    String str3 = getIntent().getStringExtra("page_url");
    paramBundle = getIntent().getStringExtra("thumb_url");
    ab.i("MicroMsg.WebViewDownloadWithX5UI", "onCreate: url=%s,taskSize=%d, thumbUrl=%s", new Object[] { str1, Long.valueOf(l), paramBundle });
    Object localObject;
    if (l > 0L)
    {
      localObject = bo.my(l);
      this.utd.setText(getString(2131305538, new Object[] { localObject }));
    }
    if (g.RK())
    {
      com.tencent.mm.at.a.a locala = o.ahp();
      localObject = new c.a();
      ((c.a)localObject).ePT = 2131232160;
      ((c.a)localObject).ePH = true;
      locala.a(paramBundle, localImageView, ((c.a)localObject).ahG());
      localTextView.setVisibility(0);
      if (bo.isNullOrNil(str2))
        break label353;
      localTextView.setText(str2);
    }
    while (true)
    {
      h.pYm.e(14217, new Object[] { "", Integer.valueOf(1), str3, str1, Integer.valueOf(1) });
      this.utd.setOnClickListener(new WebViewDownloadWithX5UI.2(this, l, str1, str3));
      AppMethodBeat.o(7618);
      return;
      localImageView.setImageResource(2131232160);
      break;
      label353: localTextView.setText(getString(2131305546));
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(7619);
    super.onDestroy();
    AppMethodBeat.o(7619);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public void startActivity(Intent paramIntent)
  {
    AppMethodBeat.i(7621);
    if (bo.isEqual(paramIntent.getType(), "application/vnd.android.package-archive"))
    {
      q.a(ah.getContext(), paramIntent.getData(), null);
      AppMethodBeat.o(7621);
    }
    while (true)
    {
      return;
      super.startActivity(paramIntent);
      AppMethodBeat.o(7621);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadWithX5UI
 * JD-Core Version:    0.6.2
 */