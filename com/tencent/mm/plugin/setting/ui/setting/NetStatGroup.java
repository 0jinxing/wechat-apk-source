package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class NetStatGroup extends LinearLayout
{
  LinearLayout qkU;
  final TextView qkV;

  public NetStatGroup(Context paramContext)
  {
    this(paramContext, null);
  }

  public NetStatGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(126965);
    View.inflate(paramContext, 2130970294, this);
    this.qkU = ((LinearLayout)findViewById(2131826032));
    this.qkV = ((TextView)findViewById(2131820787));
    this.qkV.setTextSize(0, paramContext.getResources().getDimensionPixelSize(2131427762));
    AppMethodBeat.o(126965);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.NetStatGroup
 * JD-Core Version:    0.6.2
 */