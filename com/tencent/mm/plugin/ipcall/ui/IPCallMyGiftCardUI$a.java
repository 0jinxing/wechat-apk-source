package com.tencent.mm.plugin.ipcall.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.aqk;
import com.tencent.mm.protocal.protobuf.crv;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import junit.framework.Assert;

final class IPCallMyGiftCardUI$a extends BaseAdapter
{
  private IPCallMyGiftCardUI nDA;
  aqk nDB;
  List<crv> ngC;

  public IPCallMyGiftCardUI$a(IPCallMyGiftCardUI paramIPCallMyGiftCardUI)
  {
    AppMethodBeat.i(22212);
    this.ngC = null;
    this.nDA = null;
    this.nDB = null;
    Assert.assertTrue(true);
    this.nDA = paramIPCallMyGiftCardUI;
    AppMethodBeat.o(22212);
  }

  public final int getCount()
  {
    AppMethodBeat.i(22213);
    int i;
    if (this.ngC == null)
    {
      i = 0;
      AppMethodBeat.o(22213);
    }
    while (true)
    {
      return i;
      i = this.ngC.size();
      AppMethodBeat.o(22213);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(22214);
    Object localObject;
    if (this.ngC != null)
    {
      localObject = this.ngC.get(paramInt);
      AppMethodBeat.o(22214);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(22214);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22215);
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.nDA.getSystemService("layout_inflater")).inflate(2130969900, paramViewGroup, false);
      paramViewGroup = new IPCallMyGiftCardUI.a.a(this, (byte)0);
      paramViewGroup.nDC = ((TextView)paramView.findViewById(2131825044));
      paramViewGroup.nDD = ((TextView)paramView.findViewById(2131825045));
      paramViewGroup.nDE = ((TextView)paramView.findViewById(2131825046));
      paramViewGroup.nDF = ((CdnImageView)paramView.findViewById(2131821043));
      paramViewGroup.nDG = ((ImageView)paramView.findViewById(2131825167));
      paramView.setTag(paramViewGroup);
    }
    crv localcrv;
    while (true)
    {
      localcrv = (crv)getItem(paramInt);
      if (localcrv != null)
        break;
      AppMethodBeat.o(22215);
      return paramView;
      paramViewGroup = (IPCallMyGiftCardUI.a.a)paramView.getTag();
    }
    if (bo.isNullOrNil(localcrv.xpv))
    {
      paramViewGroup.nDC.setVisibility(0);
      paramViewGroup.nDD.setVisibility(0);
      paramViewGroup.nDE.setVisibility(8);
      paramViewGroup.nDC.setText(localcrv.wOs);
      paramViewGroup.nDD.setText(localcrv.xpu);
      label204: a.b.a(paramViewGroup.nDG, "", 0.5F, false);
      if (bo.isNullOrNil(localcrv.mZW))
        break label305;
      paramViewGroup.nDF.setVisibility(0);
      paramViewGroup.nDF.setUrl(localcrv.mZW);
      paramViewGroup.nDG.setVisibility(4);
    }
    while (true)
    {
      AppMethodBeat.o(22215);
      break;
      paramViewGroup.nDC.setVisibility(8);
      paramViewGroup.nDD.setVisibility(8);
      paramViewGroup.nDE.setVisibility(0);
      paramViewGroup.nDE.setText(localcrv.xpv);
      break label204;
      label305: paramViewGroup.nDG.setVisibility(0);
      paramViewGroup.nDF.setVisibility(4);
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI.a
 * JD-Core Version:    0.6.2
 */