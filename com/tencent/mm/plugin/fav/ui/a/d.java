package com.tencent.mm.plugin.fav.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public abstract class d extends BaseAdapter
  implements View.OnClickListener
{
  private Context context;
  public String kPJ;
  public List<String> mlx = new LinkedList();
  public SparseArray<SpannableString> mly = new SparseArray();

  public d(Context paramContext)
  {
    this.context = paramContext;
  }

  private String getItem(int paramInt)
  {
    return (String)this.mlx.get(paramInt);
  }

  protected abstract void KI(String paramString);

  public int getCount()
  {
    return this.mlx.size();
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramViewGroup = View.inflate(this.context, 2130969531, null);
      paramViewGroup.setOnClickListener(this);
    }
    TextView localTextView = (TextView)paramViewGroup.findViewById(2131823980);
    String str = bo.bc(getItem(paramInt), "");
    int i = (int)localTextView.getTextSize();
    paramInt = str.hashCode();
    paramView = (SpannableString)this.mly.get(paramInt);
    if (paramView != null);
    while (true)
    {
      localTextView.setText(paramView);
      return paramViewGroup;
      paramView = new SpannableString(j.b(this.context, str, i));
      int j = str.indexOf(this.kPJ);
      if (-1 == j)
      {
        ab.w("MicroMsg.FavoriteTagSearchAdapter", "high light %s error", new Object[] { str });
      }
      else
      {
        i = this.kPJ.length() + j;
        paramView.setSpan(new ForegroundColorSpan(this.context.getResources().getColor(2131690683)), j, i, 33);
        paramView.setSpan(new StyleSpan(1), j, i, 33);
        this.mly.put(paramInt, paramView);
      }
    }
  }

  public void onClick(View paramView)
  {
    paramView = ((TextView)paramView.findViewById(2131823980)).getText().toString();
    ab.d("MicroMsg.FavoriteTagSearchAdapter", "select search tag %s", new Object[] { paramView });
    KI(paramView);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.a.d
 * JD-Core Version:    0.6.2
 */