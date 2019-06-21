package com.tencent.mm.ui.chatting.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.c;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.picker.OptionPicker;
import java.util.ArrayList;
import java.util.Calendar;

public final class b
{
  private Button grC;
  private View iym;
  private Button jAH;
  Context mContext;
  private BottomSheetBehavior nA;
  OptionPicker zaU;
  OptionPicker zaV;
  c zaW;
  private int zaX;
  public b.a zaY;
  ArrayList<Long> zaZ;

  public b(Context paramContext)
  {
    AppMethodBeat.i(32780);
    this.zaZ = new ArrayList(42);
    this.mContext = paramContext;
    this.iym = View.inflate(this.mContext, 2130970504, null);
    this.zaW = new c(this.mContext);
    this.zaW.setContentView(this.iym);
    this.zaW.setOnDismissListener(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        b.this.zaW = null;
      }
    });
    this.zaU = ((OptionPicker)this.iym.findViewById(2131826963));
    this.zaV = ((OptionPicker)this.iym.findViewById(2131826451));
    this.zaU.setValue(0);
    this.zaU.setMinWidth(a.fromDPToPix(this.mContext, 60));
    this.zaV.setMinWidth(a.fromDPToPix(this.mContext, 60));
    this.zaU.setOptionsArray(dHi());
    this.zaV.setOptionsArray(Pk(0));
    this.zaU.setOnValueChangedListener(new b.2(this));
    paramContext = (FrameLayout.LayoutParams)this.iym.getLayoutParams();
    paramContext.height = a.fromDPToPix(this.mContext, 288);
    this.iym.setLayoutParams(paramContext);
    this.zaX = a.fromDPToPix(this.mContext, 350);
    this.nA = BottomSheetBehavior.j((View)this.iym.getParent());
    if (this.nA != null)
    {
      this.nA.K(this.zaX);
      this.nA.nj = false;
    }
    this.grC = ((Button)this.iym.findViewById(2131823196));
    this.grC.setOnClickListener(new b.3(this));
    this.jAH = ((Button)this.iym.findViewById(2131822819));
    this.jAH.setOnClickListener(new b.4(this));
    AppMethodBeat.o(32780);
  }

  private String[] dHi()
  {
    int i = 0;
    AppMethodBeat.i(32784);
    this.zaZ.clear();
    ArrayList localArrayList = new ArrayList();
    Object localObject = Calendar.getInstance();
    int j = 0;
    if (j < ((Calendar)localObject).getActualMaximum(5))
    {
      if ((com.tencent.mm.sdk.a.b.dnO()) && (j == 0))
      {
        localArrayList.add("test");
        this.zaZ.add(Long.valueOf(((Calendar)localObject).getTimeInMillis()));
      }
      label107: String str;
      if (j == 0)
      {
        ((Calendar)localObject).setTimeInMillis(System.currentTimeMillis() + 86400000L * j);
        this.zaZ.add(Long.valueOf(((Calendar)localObject).getTimeInMillis()));
        str = h.formatTime(this.mContext.getString(2131299933), ((Calendar)localObject).getTimeInMillis() / 1000L);
        if (j != 0)
          break label218;
        localArrayList.add(this.mContext.getResources().getString(2131299977));
      }
      while (true)
      {
        j++;
        break;
        ((Calendar)localObject).setTimeInMillis(System.currentTimeMillis() + 86400000L * j);
        ((Calendar)localObject).set(11, 0);
        ((Calendar)localObject).set(12, 0);
        ((Calendar)localObject).set(13, 0);
        ((Calendar)localObject).set(14, 0);
        this.zaZ.add(Long.valueOf(((Calendar)localObject).getTimeInMillis()));
        break label107;
        label218: if (j == 1)
          localArrayList.add(str + " " + this.mContext.getResources().getString(2131299978));
        else if (j == 2)
          localArrayList.add(str + " " + this.mContext.getResources().getString(2131299968));
        else
          localArrayList.add(str + " " + h.af(this.mContext, ((Calendar)localObject).get(7)));
      }
    }
    int k = ((Calendar)localObject).get(1);
    int m = ((Calendar)localObject).get(2) + 1;
    j = i;
    if (j < 12)
    {
      if (m + j > 12)
      {
        ((Calendar)localObject).set(1, k + 1);
        ((Calendar)localObject).set(2, m + j - 12);
      }
      while (true)
      {
        ((Calendar)localObject).set(5, 1);
        this.zaZ.add(Long.valueOf(((Calendar)localObject).getTimeInMillis()));
        localArrayList.add(String.valueOf(h.formatTime(this.mContext.getString(2131299953), ((Calendar)localObject).getTimeInMillis() / 1000L)));
        j++;
        break;
        ((Calendar)localObject).set(2, m + j);
      }
    }
    localObject = bo.ej(localArrayList);
    AppMethodBeat.o(32784);
    return localObject;
  }

  final String[] Pk(int paramInt)
  {
    AppMethodBeat.i(32783);
    ArrayList localArrayList = new ArrayList();
    int i;
    label50: StringBuilder localStringBuilder;
    if (com.tencent.mm.sdk.a.b.dnO())
    {
      i = 1;
      switch (paramInt - i)
      {
      default:
        paramInt = 1;
        if (paramInt <= 24)
        {
          localStringBuilder = new StringBuilder();
          if (paramInt >= 10)
            break label192;
        }
        break;
      case -1:
      case 0:
      }
    }
    label192: for (Object localObject = "0".concat(String.valueOf(paramInt)); ; localObject = Integer.valueOf(paramInt))
    {
      localArrayList.add(localObject + ":00");
      paramInt++;
      break label50;
      i = 0;
      break;
      localArrayList.add("after 6 min");
      while (true)
      {
        localObject = bo.ej(localArrayList);
        AppMethodBeat.o(32783);
        return localObject;
        i = Calendar.getInstance().get(11);
        for (paramInt = 1; paramInt <= 24 - i; paramInt++)
          localArrayList.add(this.mContext.getResources().getString(2131296497, new Object[] { Integer.valueOf(paramInt) }));
      }
    }
  }

  public final void hide()
  {
    AppMethodBeat.i(32782);
    if (this.zaW != null)
      this.zaW.dismiss();
    AppMethodBeat.o(32782);
  }

  public final void show()
  {
    AppMethodBeat.i(32781);
    if (this.zaW != null)
      this.zaW.show();
    AppMethodBeat.o(32781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.view.b
 * JD-Core Version:    0.6.2
 */