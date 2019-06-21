package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMGridPaper;
import com.tencent.mm.ui.base.i;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
{
  private Context mContext;
  private i nLl;
  private MMGridPaper nLm;
  private a nLn;
  private ViewGroup nLo;
  private RelativeLayout nLp;
  private ArrayList<String> nLq;
  private int nLr;

  private b(Context paramContext)
  {
    AppMethodBeat.i(113423);
    this.nLl = null;
    this.nLm = null;
    this.nLn = null;
    this.nLo = null;
    this.nLp = null;
    this.mContext = null;
    this.nLq = null;
    this.nLr = 0;
    this.mContext = paramContext;
    this.nLl = new i(this.mContext, 2131493898);
    this.nLo = ((ViewGroup)((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(2130968793, null));
    this.nLm = ((MMGridPaper)this.nLo.findViewById(2131821562));
    this.nLm.dzJ();
    this.nLm.setDialogMode(true);
    this.nLm.dzI();
    this.nLm.setMaxRow(3);
    this.nLm.setMaxCol(3);
    this.nLm.setHeaderView(null);
    this.nLm.dzJ();
    this.nLm.setItemWidthInDp(70);
    this.nLm.setItemHeightInDp(70);
    this.nLl.setCanceledOnTouchOutside(true);
    this.nLl.setContentView(this.nLo);
    this.nLn = new a();
    this.nLm.setGridPaperAdapter(this.nLn);
    AppMethodBeat.o(113423);
  }

  public static void b(Context paramContext, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(113424);
    ab.d("MicroMsg.AvatarsDialog", "showDialog, username.size = %d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    paramContext = new b(paramContext);
    paramContext.nLq = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    String str;
    while (paramArrayList.hasNext())
    {
      str = (String)paramArrayList.next();
      paramContext.nLq.add(str);
    }
    int i;
    int j;
    if (paramContext.nLq.size() < 3)
    {
      paramContext.nLm.setMaxCol(paramContext.nLq.size());
      paramArrayList = paramContext.nLm.getLayoutParams();
      paramContext.nLr = com.tencent.mm.bz.a.fromDPToPix(paramContext.mContext, 70);
      i = com.tencent.mm.bz.a.fromDPToPix(paramContext.mContext, 8);
      if (paramContext.nLq.size() <= 0)
        break label455;
      if (paramContext.nLq.size() >= 3)
        break label382;
      j = paramContext.nLr;
      int k = paramContext.nLq.size();
      j = i * (paramContext.nLq.size() - 1) + j * k;
    }
    while (true)
    {
      label193: str = BackwardSupportUtil.b.gi(paramContext.mContext);
      ab.d("MicroMsg.AvatarsDialog", "calculateGridWidth, result = %d, mUsername.size = %d, avatarSize = %d, densityType = %s", new Object[] { Integer.valueOf(j), Integer.valueOf(paramContext.nLq.size()), Integer.valueOf(paramContext.nLr), str });
      paramArrayList.width = j;
      paramContext.nLr = com.tencent.mm.bz.a.fromDPToPix(paramContext.mContext, 70);
      j = com.tencent.mm.bz.a.fromDPToPix(paramContext.mContext, 15);
      if (paramContext.nLq.size() > 0)
        if (paramContext.nLq.size() <= 3)
        {
          j += paramContext.nLr;
          label307: ab.d("MicroMsg.AvatarsDialog", "calculateGridHeight, result = %d", new Object[] { Integer.valueOf(j) });
        }
      while (true)
      {
        paramArrayList.height = j;
        paramContext.nLm.setLayoutParams(paramArrayList);
        paramContext.nLm.requestLayout();
        paramContext.nLn.F(paramContext.nLq);
        paramContext.nLl.show();
        AppMethodBeat.o(113424);
        return;
        paramContext.nLm.setMaxCol(3);
        break;
        label382: j = i * 2 + paramContext.nLr * 3;
        break label193;
        if (paramContext.nLq.size() <= 6)
        {
          j += paramContext.nLr * 2;
          break label307;
        }
        j = j * 2 + paramContext.nLr * 3 + com.tencent.mm.bz.a.fromDPToPix(paramContext.mContext, 10);
        break label307;
        j = 0;
      }
      label455: j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.b
 * JD-Core Version:    0.6.2
 */