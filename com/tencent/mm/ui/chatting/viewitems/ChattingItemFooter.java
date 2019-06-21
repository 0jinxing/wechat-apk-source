package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.j;
import com.tencent.mm.aj.q;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public class ChattingItemFooter extends LinearLayout
  implements View.OnClickListener
{
  private static final int[] zfI = { 2130838219, 2130838219, 2130838225, 2130838222 };
  private static final int[] zfJ = { 2130839976, 2130839980, 2130839985, 2130839982 };
  private String igi;
  private Context mContext;
  private LayoutInflater mInflater;

  public ChattingItemFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(33207);
    this.mContext = paramContext;
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    AppMethodBeat.o(33207);
  }

  private TextView a(int paramInt1, int paramInt2, LinearLayout.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(33209);
    if (paramInt1 < paramInt2)
    {
      paramLayoutParams = (TextView)getChildAt(paramInt1);
      AppMethodBeat.o(33209);
    }
    while (true)
    {
      return paramLayoutParams;
      TextView localTextView = (TextView)this.mInflater.inflate(2130969045, null);
      localTextView.setLongClickable(false);
      localTextView.setOnClickListener(this);
      localTextView.setLayoutParams(paramLayoutParams);
      addView(localTextView);
      AppMethodBeat.o(33209);
      paramLayoutParams = localTextView;
    }
  }

  private void d(j paramj)
  {
    AppMethodBeat.i(33210);
    paramj = new q(this.igi, paramj.getInfo());
    aw.Rg().a(paramj, 0);
    AppMethodBeat.o(33210);
  }

  public final boolean l(List<j> paramList, String paramString)
  {
    AppMethodBeat.i(33208);
    boolean bool;
    if ((paramList == null) || (paramList.size() <= 0))
    {
      ab.d("ChattingItemFooter", "no menulist!");
      setVisibility(8);
      AppMethodBeat.o(33208);
      bool = false;
      return bool;
    }
    this.igi = paramString;
    int i = getChildCount();
    paramString = zfI;
    Object localObject1 = new LinearLayout.LayoutParams(0, -1);
    ((LinearLayout.LayoutParams)localObject1).weight = 1.0F;
    int j = paramList.size();
    switch (j)
    {
    default:
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      if ((i > j) && (i - 1 > 0))
        removeViews(j, i - 1);
      setLongClickable(true);
      setVisibility(0);
      AppMethodBeat.o(33208);
      bool = true;
      break;
      paramList = (j)paramList.get(0);
      localObject1 = a(0, i, (LinearLayout.LayoutParams)localObject1);
      ((TextView)localObject1).setText(paramList.name);
      ((TextView)localObject1).setTag(paramList);
      ((TextView)localObject1).setBackgroundResource(paramString[3]);
      continue;
      Object localObject2 = (j)paramList.get(1);
      Object localObject3 = a(1, i, (LinearLayout.LayoutParams)localObject1);
      ((TextView)localObject3).setText(((j)localObject2).name);
      ((TextView)localObject3).setTag(localObject2);
      ((TextView)localObject3).setBackgroundResource(paramString[1]);
      localObject3 = (j)paramList.get(0);
      localObject2 = a(0, i, (LinearLayout.LayoutParams)localObject1);
      ((TextView)localObject2).setText(((j)localObject3).name);
      ((TextView)localObject2).setTag(localObject3);
      ((TextView)localObject2).setBackgroundResource(paramString[0]);
      paramList = (j)paramList.get(j - 1);
      localObject1 = a(j - 1, i, (LinearLayout.LayoutParams)localObject1);
      ((TextView)localObject1).setText(paramList.name);
      ((TextView)localObject1).setTag(paramList);
      ((TextView)localObject1).setBackgroundResource(paramString[2]);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(33211);
    paramView = paramView.getTag();
    if (!(paramView instanceof j))
    {
      AppMethodBeat.o(33211);
      return;
    }
    paramView = (j)paramView;
    switch (paramView.type)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(33211);
      break;
      ab.d("ChattingItemFooter", "get latest message");
      paramView.state = j.fwo;
      d(paramView);
      AppMethodBeat.o(33211);
      break;
      ab.d("ChattingItemFooter", "start webview url");
      paramView.state = j.fwo;
      d(paramView);
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramView.value);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("geta8key_username", this.igi);
      d.b(this.mContext, "webview", ".ui.tools.WebViewUI", localIntent);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ChattingItemFooter
 * JD-Core Version:    0.6.2
 */