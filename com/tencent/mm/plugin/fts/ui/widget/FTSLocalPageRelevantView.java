package com.tencent.mm.plugin.fts.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.btf;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FTSLocalPageRelevantView extends LinearLayout
  implements View.OnClickListener
{
  public String hlm;
  public LinearLayout jbJ;
  private FTSLocalPageRelevantView.b mMb;
  public List<btf> mMc;
  public String query;

  public FTSLocalPageRelevantView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(62138);
    this.mMb = null;
    this.query = null;
    this.hlm = null;
    this.mMc = null;
    post(new FTSLocalPageRelevantView.1(this));
    AppMethodBeat.o(62138);
  }

  public FTSLocalPageRelevantView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mMb = null;
    this.query = null;
    this.hlm = null;
    this.mMc = null;
  }

  public FTSLocalPageRelevantView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mMb = null;
    this.query = null;
    this.hlm = null;
    this.mMc = null;
  }

  public static List<btf> ca(List<btf> paramList)
  {
    AppMethodBeat.i(62141);
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      btf localbtf = (btf)paramList.next();
      if (!bo.isNullOrNil(localbtf.wVl))
        localLinkedList.add(localbtf);
    }
    AppMethodBeat.o(62141);
    return localLinkedList;
  }

  public final void b(List<btf> paramList, LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(62140);
    paramLinearLayout.removeAllViews();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (btf)localIterator.next();
      if (localObject != null)
      {
        View localView = LayoutInflater.from(paramLinearLayout.getContext()).inflate(2130969644, paramLinearLayout, false);
        TextView localTextView = (TextView)localView.findViewById(2131821019);
        localView.setOnClickListener(new FTSLocalPageRelevantView.2(this));
        localTextView.setText(((btf)localObject).wVl);
        int i = paramList.indexOf(localObject);
        if ((paramList != null) && (i < paramList.size()));
        for (localObject = new FTSLocalPageRelevantView.a(this, (btf)paramList.get(i), i + 1); ; localObject = null)
        {
          localView.setTag(localObject);
          paramLinearLayout.addView(localView);
          break;
        }
      }
    }
    AppMethodBeat.o(62140);
  }

  public String getQuery()
  {
    if (this.query != null);
    for (String str = this.query; ; str = "")
      return str;
  }

  public String getSearchId()
  {
    if (this.hlm != null);
    for (String str = this.hlm; ; str = "")
      return str;
  }

  public String getWordList()
  {
    AppMethodBeat.i(62142);
    StringBuilder localStringBuilder = new StringBuilder("");
    if (this.mMc != null)
    {
      localObject = this.mMc.iterator();
      while (((Iterator)localObject).hasNext())
      {
        btf localbtf = (btf)((Iterator)localObject).next();
        if (localStringBuilder.length() > 0)
          localStringBuilder.append("|");
        localStringBuilder.append(localbtf.wVl);
      }
    }
    Object localObject = localStringBuilder.toString();
    AppMethodBeat.o(62142);
    return localObject;
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(62139);
    if ((this.mMb != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof FTSLocalPageRelevantView.a)))
    {
      paramView = (FTSLocalPageRelevantView.a)paramView.getTag();
      this.mMb.a(paramView.mMe, this.hlm, paramView.position);
    }
    AppMethodBeat.o(62139);
  }

  public void setOnRelevantClickListener(FTSLocalPageRelevantView.b paramb)
  {
    this.mMb = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView
 * JD-Core Version:    0.6.2
 */