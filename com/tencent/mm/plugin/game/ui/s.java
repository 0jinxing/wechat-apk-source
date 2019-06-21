package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.acy;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class s extends BaseAdapter
{
  private Context context;
  private String ctj;
  private LinkedList<s.a> fjr;

  public s(Context paramContext)
  {
    AppMethodBeat.i(112182);
    this.ctj = "";
    this.fjr = new LinkedList();
    this.context = paramContext;
    AppMethodBeat.o(112182);
  }

  public final void b(String paramString1, String paramString2, LinkedList<acy> paramLinkedList)
  {
    AppMethodBeat.i(112186);
    if (bo.ek(paramLinkedList))
      AppMethodBeat.o(112186);
    while (true)
    {
      return;
      this.ctj = paramString1;
      this.fjr.clear();
      Object localObject;
      if (bo.isNullOrNil(paramString1))
      {
        localObject = new s.a();
        ((s.a)localObject).type = 1;
        if (!bo.isNullOrNil(paramString2))
        {
          ((s.a)localObject).text = paramString2;
          this.fjr.add(localObject);
        }
      }
      else
      {
        paramString2 = paramLinkedList.iterator();
        label80: if (!paramString2.hasNext())
          break label204;
        localObject = (acy)paramString2.next();
        paramLinkedList = new s.a();
        if (!bo.isNullOrNil(paramString1))
          break label198;
      }
      label198: for (int i = 2; ; i = 3)
      {
        paramLinkedList.type = i;
        paramLinkedList.appId = ((acy)localObject).mZr;
        paramLinkedList.text = ((acy)localObject).wkK;
        paramLinkedList.description = ((acy)localObject).vEA;
        paramLinkedList.actionType = ((acy)localObject).wkB;
        paramLinkedList.nmB = ((acy)localObject).wkC;
        this.fjr.add(paramLinkedList);
        break label80;
        ((s.a)localObject).text = this.context.getString(2131300344);
        break;
      }
      label204: notifyDataSetChanged();
      AppMethodBeat.o(112186);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(112184);
    int i = this.fjr.size();
    AppMethodBeat.o(112184);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(112183);
    Object localObject = wO(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130969778, null);
      paramViewGroup = new s.b((byte)0);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131824625));
      paramViewGroup.nmC = ((ViewGroup)paramViewGroup.gsf.getParent());
      paramViewGroup.nmD = ((TextView)paramView.findViewById(2131824626));
      paramViewGroup.nmE = ((TextView)paramView.findViewById(2131824627));
      paramViewGroup.nmF = ((ViewGroup)paramViewGroup.nmD.getParent());
      paramViewGroup.nmG = ((TextView)paramView.findViewById(2131824628));
      paramViewGroup.nmH = ((ViewGroup)paramViewGroup.nmG.getParent().getParent());
      paramView.setTag(paramViewGroup);
      switch (((s.a)localObject).type)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      AppMethodBeat.o(112183);
      return paramView;
      paramViewGroup = (s.b)paramView.getTag();
      break;
      paramViewGroup.nmC.setVisibility(0);
      paramViewGroup.nmF.setVisibility(8);
      paramViewGroup.nmH.setVisibility(8);
      paramViewGroup.nmC.setOnClickListener(null);
      paramViewGroup.gsf.setText(((s.a)localObject).text);
      continue;
      paramViewGroup.nmC.setVisibility(8);
      paramViewGroup.nmF.setVisibility(0);
      paramViewGroup.nmH.setVisibility(8);
      paramViewGroup.nmD.setText(((s.a)localObject).text);
      paramViewGroup.nmE.setText(((s.a)localObject).description);
      continue;
      paramViewGroup.nmC.setVisibility(8);
      paramViewGroup.nmF.setVisibility(8);
      paramViewGroup.nmH.setVisibility(0);
      paramInt = this.context.getResources().getColor(2131690316);
      paramViewGroup.nmG.setTextColor(paramInt);
      int i = this.context.getResources().getColor(2131690123);
      paramInt = ((s.a)localObject).text.indexOf(this.ctj);
      if (paramInt >= 0)
      {
        localObject = new SpannableString(((s.a)localObject).text);
        ((Spannable)localObject).setSpan(new ForegroundColorSpan(i), paramInt, this.ctj.length() + paramInt, 33);
        paramViewGroup.nmG.setText((CharSequence)localObject);
      }
      else
      {
        paramViewGroup.nmG.setText(((s.a)localObject).text);
      }
    }
  }

  public final s.a wO(int paramInt)
  {
    AppMethodBeat.i(112185);
    s.a locala = (s.a)this.fjr.get(paramInt);
    AppMethodBeat.o(112185);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.s
 * JD-Core Version:    0.6.2
 */