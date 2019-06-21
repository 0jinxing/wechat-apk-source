package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"UseSparseArrays"})
public class PreviewContactView extends LinearLayout
{
  private final Context context;
  private List<String> list;
  private TableLayout rmd;
  private final Map<Integer, View> rme;

  @SuppressLint({"UseSparseArrays"})
  private final Map<Integer, TableRow> rmf;
  private int rmg;

  public PreviewContactView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38509);
    this.list = new ArrayList();
    this.rme = new HashMap();
    this.rmf = new HashMap();
    this.rmg = 5;
    this.context = paramContext;
    this.rmd = ((TableLayout)LayoutInflater.from(this.context).inflate(2130970792, this, true).findViewById(2131821019));
    AppMethodBeat.o(38509);
  }

  public void setImageClick(a parama)
  {
  }

  public void setLineNum(int paramInt)
  {
    AppMethodBeat.i(38510);
    this.rmg = paramInt;
    setList(this.list);
    AppMethodBeat.o(38510);
  }

  public void setList(List<String> paramList)
  {
    AppMethodBeat.i(38511);
    if (paramList == null)
      AppMethodBeat.o(38511);
    while (true)
    {
      return;
      this.list = paramList;
      this.rmd.removeAllViews();
      if (paramList.size() != 0)
        break;
      AppMethodBeat.o(38511);
    }
    int i = paramList.size();
    int j = 0;
    int k = 0;
    label56: TableRow localTableRow;
    if (k < i)
    {
      localTableRow = (TableRow)this.rmf.get(Integer.valueOf(j));
      if (localTableRow != null)
        break label286;
      localTableRow = new TableRow(this.context);
      this.rmf.put(Integer.valueOf(j), localTableRow);
    }
    label286: 
    while (true)
    {
      localTableRow.removeAllViews();
      int m = 0;
      while ((m < this.rmg) && (k < i))
      {
        Object localObject1 = (View)this.rme.get(Integer.valueOf(k));
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject2 = View.inflate(this.context, 2130970791, null);
          this.rme.put(Integer.valueOf(k), localObject2);
        }
        localObject1 = (String)paramList.get(k);
        ImageView localImageView = (ImageView)((View)localObject2).findViewById(2131822744);
        localImageView.setBackgroundDrawable(null);
        a.b.b(localImageView, (String)localObject1);
        ((View)localObject2).setTag(Integer.valueOf(0));
        ((View)localObject2).setClickable(false);
        localTableRow.addView((View)localObject2);
        m++;
        k++;
      }
      this.rmd.addView(localTableRow);
      j++;
      break label56;
      AppMethodBeat.o(38511);
      break;
    }
  }

  static abstract class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.PreviewContactView
 * JD-Core Version:    0.6.2
 */