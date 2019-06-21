package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TaskManagerHeaderView extends LinearLayout
{
  private TextView kQs;

  public TaskManagerHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(136315);
    setOrientation(1);
    this.kQs = ((TextView)LayoutInflater.from(getContext()).inflate(2130969816, this, true).findViewById(2131822274));
    this.kQs.setOnClickListener(new TaskManagerHeaderView.1(this));
    paramContext = new View(getContext());
    paramContext.setBackgroundColor(getResources().getColor(2131689962));
    addView(paramContext, -1, 1);
    AppMethodBeat.o(136315);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskManagerHeaderView
 * JD-Core Version:    0.6.2
 */