package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.AnimImageView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class c extends p<com.tencent.mm.plugin.masssend.a.a>
{
  private static short ooB = (short)1;
  private static short ooC = (short)2;
  private static short ooD = (short)3;
  private static short ooE = (short)4;
  private MMActivity crP;
  int enb;
  private LayoutInflater ezi;
  int kmW;
  private short[] ooF;
  private List<String> ooG;
  String ooH;
  c.e ooI;

  public c(Context paramContext)
  {
    super(paramContext, new com.tencent.mm.plugin.masssend.a.a());
    AppMethodBeat.i(22787);
    this.ooH = "";
    this.crP = ((MMActivity)paramContext);
    this.ooG = new LinkedList();
    this.kmW = 10;
    this.enb = this.kmW;
    this.ezi = v.hu(paramContext);
    AppMethodBeat.o(22787);
  }

  private void bNM()
  {
    AppMethodBeat.i(22792);
    int i = getCount();
    if (i <= 0)
      AppMethodBeat.o(22792);
    while (true)
    {
      return;
      this.ooF = new short[i];
      AppMethodBeat.o(22792);
    }
  }

  private static int yr(int paramInt)
  {
    if (paramInt <= 2)
      paramInt = 100;
    while (true)
    {
      return paramInt;
      if (paramInt < 10)
        paramInt = (paramInt - 2) * 8 + 100;
      else if (paramInt < 60)
        paramInt = (paramInt / 10 + 7) * 8 + 100;
      else
        paramInt = 204;
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(22789);
    this.enb = com.tencent.mm.plugin.masssend.a.h.bNE().bNz();
    setCursor(com.tencent.mm.plugin.masssend.a.h.bNE().xm(this.kmW));
    bNM();
    super.notifyDataSetChanged();
    AppMethodBeat.o(22789);
  }

  public final void KD()
  {
    AppMethodBeat.i(22788);
    KC();
    AppMethodBeat.o(22788);
  }

  public final void Qv(String paramString)
  {
    AppMethodBeat.i(22791);
    this.ooH = paramString;
    notifyDataSetChanged();
    AppMethodBeat.o(22791);
  }

  public final boolean bdn()
  {
    if (this.kmW >= this.enb);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22790);
    com.tencent.mm.plugin.masssend.a.a locala = (com.tencent.mm.plugin.masssend.a.a)getItem(paramInt);
    int i;
    int j;
    label84: label102: label126: Object localObject1;
    if (paramInt != 0)
    {
      long l1 = ((com.tencent.mm.plugin.masssend.a.a)getItem(paramInt - 1)).createTime;
      locala = (com.tencent.mm.plugin.masssend.a.a)getItem(paramInt);
      long l2 = locala.createTime;
      if (l2 - l1 < 60000L)
      {
        i = 1;
        if ((l2 - l1) / 180000L >= 1L)
          break label501;
        j = 1;
        if ((i == 0) && (j == 0))
          break label507;
        this.ooF[paramInt] = ((short)2);
        if ((this.ooF[paramInt] != 1) || (locala.createTime <= 1000L))
          break label529;
        paramInt = 1;
        switch (locala.msgType)
        {
        default:
          paramViewGroup = paramView;
          label174: paramView = (c.f)paramViewGroup.getTag();
          label260: if (paramInt != 0)
          {
            paramView.ngD.setVisibility(0);
            paramView.ngD.setText(com.tencent.mm.pluginsdk.f.h.c(this.crP, locala.createTime, false));
            label214: switch (locala.msgType)
            {
            default:
              localObject1 = (c.f)paramViewGroup.getTag();
              ((c.f)localObject1).ooK.setText(this.crP.getResources().getQuantityString(2131361809, locala.ooa, new Object[] { Integer.valueOf(locala.ooa) }));
              if (this.ooG.contains(locala.bNv()))
              {
                ((c.f)localObject1).ooL.setSingleLine(false);
                ((c.f)localObject1).ooL.setEllipsize(null);
              }
              break;
            case 1:
            case 34:
            case 3:
            case 43:
            }
          }
          break;
        case 1:
        case 34:
        case 3:
        case 43:
        }
      }
    }
    while (true)
    {
      Object localObject2 = ((c.f)localObject1).ooL;
      MMActivity localMMActivity = this.crP;
      paramView = new ArrayList();
      if ((locala.bNy() != null) && (!locala.bNy().equals("")))
        break label1761;
      paramView = "";
      ((TextView)localObject2).setText(j.b(localMMActivity, paramView, ((c.f)localObject1).ooL.getTextSize()));
      paramInt = (int)((c.f)localObject1).ooL.getTextSize();
      paramView = ((c.f)localObject1).ooL.getText().toString();
      com.tencent.mm.bz.a.fromDPToPix(this.crP, 255);
      localObject2 = new Paint();
      ((Paint)localObject2).setTextSize(paramInt);
      ((Paint)localObject2).measureText(paramView);
      ((c.f)localObject1).ooO.setOnClickListener(new c.b(this, locala.bNv()));
      AppMethodBeat.o(22790);
      return paramViewGroup;
      i = 0;
      break;
      label501: j = 0;
      break label84;
      label507: this.ooF[paramInt] = ((short)1);
      break label102;
      this.ooF[paramInt] = ((short)1);
      break label102;
      label529: paramInt = 0;
      break label126;
      localObject1 = new c.f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((c.f)paramView.getTag()).ooR == ooB)
          break label174;
      }
      paramViewGroup = this.ezi.inflate(2130970073, null);
      ((c.f)localObject1).ooK = ((TextView)paramViewGroup.findViewById(2131825925));
      ((c.f)localObject1).ooL = ((TextView)paramViewGroup.findViewById(2131825926));
      ((c.f)localObject1).ooM = ((TextView)paramViewGroup.findViewById(2131825929));
      ((c.f)localObject1).ooO = ((TextView)paramViewGroup.findViewById(2131825928));
      ((c.f)localObject1).ngD = ((TextView)paramViewGroup.findViewById(2131825923));
      ((c.f)localObject1).ooQ = paramViewGroup.findViewById(2131825924);
      ((c.f)localObject1).ooR = ((short)ooB);
      paramViewGroup.setTag(localObject1);
      break label174;
      localObject1 = new c.f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((c.f)paramView.getTag()).ooR == ooE)
          break label174;
      }
      paramViewGroup = this.ezi.inflate(2130970075, null);
      ((c.f)localObject1).ooK = ((TextView)paramViewGroup.findViewById(2131825925));
      ((c.f)localObject1).ooL = ((TextView)paramViewGroup.findViewById(2131825926));
      ((c.f)localObject1).ooN = ((TextView)paramViewGroup.findViewById(2131825932));
      ((c.f)localObject1).ooM = ((TextView)paramViewGroup.findViewById(2131825933));
      ((c.f)localObject1).ooP = ((AnimImageView)paramViewGroup.findViewById(2131825934));
      ((c.f)localObject1).ooO = ((TextView)paramViewGroup.findViewById(2131825928));
      ((c.f)localObject1).ngD = ((TextView)paramViewGroup.findViewById(2131825923));
      ((c.f)localObject1).ooQ = paramViewGroup.findViewById(2131825924);
      ((c.f)localObject1).ooR = ((short)ooE);
      paramViewGroup.setTag(localObject1);
      break label174;
      localObject1 = new c.f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((c.f)paramView.getTag()).ooR == ooC)
          break label174;
      }
      paramViewGroup = this.ezi.inflate(2130970072, null);
      ((c.f)localObject1).ooK = ((TextView)paramViewGroup.findViewById(2131825925));
      ((c.f)localObject1).ooL = ((TextView)paramViewGroup.findViewById(2131825926));
      ((c.f)localObject1).miw = ((ImageView)paramViewGroup.findViewById(2131825927));
      ((c.f)localObject1).ooO = ((TextView)paramViewGroup.findViewById(2131825928));
      ((c.f)localObject1).ngD = ((TextView)paramViewGroup.findViewById(2131825923));
      ((c.f)localObject1).ooQ = paramViewGroup.findViewById(2131825924);
      ((c.f)localObject1).ooR = ((short)ooC);
      paramViewGroup.setTag(localObject1);
      break label174;
      localObject1 = new c.f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((c.f)paramView.getTag()).ooR == ooD)
          break label174;
      }
      paramViewGroup = this.ezi.inflate(2130970074, null);
      ((c.f)localObject1).ooK = ((TextView)paramViewGroup.findViewById(2131825925));
      ((c.f)localObject1).ooL = ((TextView)paramViewGroup.findViewById(2131825926));
      ((c.f)localObject1).miw = ((ImageView)paramViewGroup.findViewById(2131825927));
      ((c.f)localObject1).ooN = ((TextView)paramViewGroup.findViewById(2131825930));
      ((c.f)localObject1).ooO = ((TextView)paramViewGroup.findViewById(2131825928));
      ((c.f)localObject1).ngD = ((TextView)paramViewGroup.findViewById(2131825923));
      ((c.f)localObject1).ooQ = paramViewGroup.findViewById(2131825924);
      ((c.f)localObject1).ooR = ((short)ooD);
      paramViewGroup.setTag(localObject1);
      break label174;
      paramView.ngD.setVisibility(8);
      break label214;
      paramView = (c.f)paramViewGroup.getTag();
      paramView.ooM.setText(locala.bNw());
      j.h(paramView.ooM, 1);
      break label260;
      paramView = (c.f)paramViewGroup.getTag();
      float f = q.fY(locala.oob);
      if (locala.bNv().equals(this.ooH))
      {
        paramView.ooP.setVisibility(0);
        paramView.ooP.dzr();
        paramView.ooM.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      }
      while (true)
      {
        paramView.ooN.setText(this.crP.getString(2131300005, new Object[] { Integer.valueOf((int)f) }));
        paramView.ooM.setWidth(com.tencent.mm.bz.a.fromDPToPix(paramView.ooM.getContext(), yr((int)f)));
        paramView.ooP.setWidth(com.tencent.mm.bz.a.fromDPToPix(paramView.ooM.getContext(), yr((int)f)));
        paramView.ooM.setOnClickListener(new c.d(this, locala.bNv()));
        break;
        paramView.ooP.setVisibility(8);
        paramView.ooP.ceT();
        paramView.ooM.setCompoundDrawablesWithIntrinsicBounds(null, null, this.crP.getResources().getDrawable(2131231113), null);
      }
      paramView = (c.f)paramViewGroup.getTag();
      aw.ZK();
      if (com.tencent.mm.model.c.isSDCardAvailable())
      {
        com.tencent.mm.plugin.masssend.a.h.bNE();
        localObject1 = b.Qr(locala.bNw());
        if (localObject1 != null)
          paramView.miw.setImageBitmap((Bitmap)localObject1);
      }
      while (true)
      {
        paramView.miw.setOnClickListener(new c.a(this, locala.bNw(), locala.ooe));
        break;
        com.tencent.mm.plugin.masssend.a.h.bNE();
        localObject1 = b.g(locala.bNx(), com.tencent.mm.bz.a.getDensity(paramView.miw.getContext()));
        paramView.miw.setImageBitmap((Bitmap)localObject1);
        continue;
        paramView.miw.setImageDrawable(com.tencent.mm.bz.a.g(this.crP, 2130839707));
      }
      paramView = (c.f)paramViewGroup.getTag();
      com.tencent.mm.modelvideo.o.all();
      localObject1 = t.ui(locala.bNw());
      localObject1 = com.tencent.mm.at.o.ahl().a((String)localObject1, com.tencent.mm.bz.a.getDensity(paramView.miw.getContext()), this.crP);
      if (localObject1 == null)
      {
        aw.ZK();
        if (!com.tencent.mm.model.c.isSDCardAvailable())
          paramView.miw.setImageDrawable(com.tencent.mm.bz.a.g(this.crP, 2131232096));
      }
      while (true)
      {
        paramView.miw.setOnClickListener(new c.c(this, locala.bNw(), locala.videoSource, locala.cde, locala.oob));
        if (locala.videoSource != 2)
          break label1712;
        paramView.ooN.setVisibility(8);
        break;
        paramView.miw.setImageDrawable(com.tencent.mm.bz.a.g(this.crP, 2131690151));
        continue;
        paramView.miw.setImageBitmap((Bitmap)localObject1);
      }
      label1712: paramView.ooN.setVisibility(0);
      paramView.ooN.setText(bo.mK(locala.oob));
      break label260;
      ((c.f)localObject1).ooL.setSingleLine(true);
      ((c.f)localObject1).ooL.setEllipsize(TextUtils.TruncateAt.END);
    }
    label1761: Object localObject3 = locala.bNy().split(";");
    if ((localObject3 != null) && (localObject3.length > 0))
      paramView = bo.P((String[])localObject3);
    while (true)
    {
      if (paramView == null)
      {
        paramView = "";
        break;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      paramInt = 0;
      if (paramInt < paramView.size())
      {
        localObject3 = s.mJ((String)paramView.get(paramInt));
        if (paramInt == paramView.size() - 1)
          localStringBuilder.append((String)localObject3);
        while (true)
        {
          paramInt++;
          break;
          localStringBuilder.append((String)localObject3 + ", ");
        }
      }
      paramView = localStringBuilder.toString();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.c
 * JD-Core Version:    0.6.2
 */