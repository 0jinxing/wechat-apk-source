package com.tencent.mm.ui.chatting.viewitems;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class v extends RelativeLayout
{
  private LayoutInflater ezi;
  private int zeL;

  public v(LayoutInflater paramLayoutInflater, int paramInt)
  {
    super(paramLayoutInflater.getContext());
    AppMethodBeat.i(33121);
    this.ezi = paramLayoutInflater;
    this.zeL = paramInt;
    setClipChildren(false);
    Object localObject = this.ezi.inflate(2130969026, null);
    paramLayoutInflater = new RelativeLayout.LayoutParams(-1, -2);
    ((View)localObject).setId(2131820583);
    paramLayoutInflater.setMargins(0, getResources().getDimensionPixelSize(2131427812), 0, getResources().getDimensionPixelSize(2131427812));
    ((View)localObject).setVisibility(8);
    addView((View)localObject, paramLayoutInflater);
    paramLayoutInflater = new TextView(getContext(), null, 2131493151);
    paramLayoutInflater.setId(2131820587);
    int i = paramLayoutInflater.getResources().getDimensionPixelSize(2131427866);
    paramInt = a.al(getContext(), 2131427866);
    if (paramInt != i)
      ab.e("MicroMsg.ChattingItemContainer", "warn!!! cacheSize:%s sysSize:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    paramLayoutInflater.setTextSize(0, i);
    localObject = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject).addRule(3, 2131820583);
    ((RelativeLayout.LayoutParams)localObject).addRule(14);
    ((RelativeLayout.LayoutParams)localObject).setMargins(0, getResources().getDimensionPixelSize(2131427812), 0, getResources().getDimensionPixelSize(2131427812));
    addView(paramLayoutInflater, (ViewGroup.LayoutParams)localObject);
    localObject = (CheckBox)LayoutInflater.from(getContext()).inflate(2130970096, this, false);
    ((CheckBox)localObject).setId(2131820580);
    paramInt = a.fromDPToPix(getContext(), 32);
    paramLayoutInflater = new RelativeLayout.LayoutParams(paramInt, paramInt);
    paramLayoutInflater.setMargins(0, getResources().getDimensionPixelSize(2131427500), getResources().getDimensionPixelSize(2131427858), 0);
    paramLayoutInflater.addRule(3, 2131820587);
    paramLayoutInflater.addRule(11);
    paramLayoutInflater.width = paramInt;
    paramLayoutInflater.height = paramInt;
    addView((View)localObject, paramLayoutInflater);
    localObject = this.ezi.inflate(this.zeL, null);
    i = ((View)localObject).getId();
    paramInt = i;
    if (-1 == i)
    {
      ab.v("MicroMsg.ChattingItemContainer", "content view has no id, use defaul id");
      paramInt = 2131820581;
      ((View)localObject).setId(2131820581);
    }
    paramLayoutInflater = new RelativeLayout.LayoutParams(-1, -2);
    paramLayoutInflater.addRule(3, 2131820587);
    paramLayoutInflater.addRule(0, 2131820580);
    addView((View)localObject, paramLayoutInflater);
    localObject = new View(getContext());
    ((View)localObject).setId(2131820586);
    ((View)localObject).setVisibility(8);
    paramLayoutInflater = new RelativeLayout.LayoutParams(-1, -1);
    paramLayoutInflater.addRule(6, paramInt);
    paramLayoutInflater.addRule(8, paramInt);
    addView((View)localObject, paramLayoutInflater);
    AppMethodBeat.o(33121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.v
 * JD-Core Version:    0.6.2
 */