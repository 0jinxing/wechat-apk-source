package com.tencent.mm.plugin.websearch.widget.view.footer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.v;

public class MoreFooter extends LinearLayout
{
  private Context context;
  private TextView gsf;
  private View jWH;

  public MoreFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(91584);
    this.context = paramContext;
    paramContext = (ViewGroup)v.hu(this.context).inflate(2130971236, this);
    this.gsf = ((TextView)paramContext.findViewById(2131821051));
    this.jWH = paramContext.findViewById(2131820987);
    AppMethodBeat.o(91584);
  }

  public void setOnClickLsn(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(91586);
    this.jWH.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(91586);
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(91585);
    this.gsf.setText(paramString);
    AppMethodBeat.o(91585);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.footer.MoreFooter
 * JD-Core Version:    0.6.2
 */