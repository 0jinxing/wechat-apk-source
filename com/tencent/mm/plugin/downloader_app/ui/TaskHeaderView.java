package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.i;

public class TaskHeaderView extends LinearLayout
{
  private TextView kQr;
  private TextView kQs;
  private View kQt;

  public TaskHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(i parami, boolean paramBoolean)
  {
    AppMethodBeat.i(136256);
    if (parami.type == 1)
    {
      this.kQr.setText(getResources().getString(2131298936));
      this.kQs.setVisibility(8);
      if (!paramBoolean)
        break label192;
      this.kQt.setVisibility(0);
      label50: if (!parami.kci)
        break label204;
      this.kQr.setTextColor(getContext().getResources().getColor(2131689961));
      this.kQs.setVisibility(8);
      AppMethodBeat.o(136256);
    }
    while (true)
    {
      return;
      if (parami.type == 3)
      {
        this.kQr.setText(getResources().getString(2131304175));
        this.kQs.setText(getResources().getString(2131304174, new Object[] { Integer.valueOf(parami.kPb) }));
        this.kQs.setVisibility(0);
        break;
      }
      if (parami.type != 5)
        break;
      this.kQr.setText(getResources().getString(2131298924));
      this.kQs.setVisibility(8);
      break;
      label192: this.kQt.setVisibility(8);
      break label50;
      label204: this.kQr.setTextColor(getContext().getResources().getColor(2131690190));
      this.kQs.setVisibility(0);
      AppMethodBeat.o(136256);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(136255);
    super.onFinishInflate();
    this.kQt = findViewById(2131823318);
    this.kQr = ((TextView)findViewById(2131822269));
    this.kQs = ((TextView)findViewById(2131822274));
    AppMethodBeat.o(136255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskHeaderView
 * JD-Core Version:    0.6.2
 */