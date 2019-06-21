package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PreviewImageView extends LinearLayout
  implements v
{
  private final Context context;
  private List<String> list;
  private TableLayout rmd;
  private final Map<Integer, View> rme;
  private final Map<Integer, TableRow> rmf;
  private final int rmg;
  private HashMap<String, Bitmap> rmh;
  private v.a rmi;
  private boolean rmj;
  private boolean rmk;

  public PreviewImageView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(38516);
    this.list = new ArrayList();
    this.rme = new HashMap();
    this.rmf = new HashMap();
    this.rmh = new HashMap();
    this.rmg = 4;
    this.rmj = true;
    this.rmk = false;
    this.context = paramContext;
    init();
    AppMethodBeat.o(38516);
  }

  public PreviewImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38515);
    this.list = new ArrayList();
    this.rme = new HashMap();
    this.rmf = new HashMap();
    this.rmh = new HashMap();
    this.rmg = 4;
    this.rmj = true;
    this.rmk = false;
    this.context = paramContext;
    init();
    AppMethodBeat.o(38515);
  }

  private void init()
  {
    AppMethodBeat.i(38517);
    this.rmd = ((TableLayout)LayoutInflater.from(this.context).inflate(2130970792, this, true).findViewById(2131821019));
    AppMethodBeat.o(38517);
  }

  public final void clean()
  {
    AppMethodBeat.i(38519);
    this.rmk = true;
    Iterator localIterator = this.rmh.values().iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)localIterator.next();
      if (i.B(localBitmap))
        localBitmap.recycle();
    }
    AppMethodBeat.o(38519);
  }

  public int getCount()
  {
    AppMethodBeat.i(38518);
    int i = this.rme.size();
    AppMethodBeat.o(38518);
    return i;
  }

  public View getView()
  {
    return this;
  }

  public void setImageClick(v.a parama)
  {
    this.rmi = parama;
  }

  public void setIsShowAddImage(boolean paramBoolean)
  {
    this.rmj = paramBoolean;
  }

  public final void setList$22875ea3(List<String> paramList)
  {
    AppMethodBeat.i(38520);
    long l = System.currentTimeMillis();
    if (paramList == null)
    {
      AppMethodBeat.o(38520);
      return;
    }
    this.list = paramList;
    int i = 0;
    this.rmd.removeAllViews();
    int j = paramList.size() + 1;
    int k = 0;
    label47: TableRow localTableRow;
    if (i < j)
    {
      localTableRow = (TableRow)this.rmf.get(Integer.valueOf(k));
      if (localTableRow != null)
        break label541;
      localTableRow = new TableRow(this.context);
      this.rmf.put(Integer.valueOf(k), localTableRow);
    }
    label257: label403: label541: 
    while (true)
    {
      localTableRow.removeAllViews();
      int m = 0;
      if ((m < 4) && (i < j))
        if (i >= 9)
          i++;
      while (true)
      {
        if (localTableRow.getChildCount() > 0)
          this.rmd.addView(localTableRow);
        ab.d("MicroMsg.PreviewImageView", "initlist time : " + (System.currentTimeMillis() - l));
        k++;
        break label47;
        Object localObject1 = (View)this.rme.get(Integer.valueOf(i));
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject2 = View.inflate(this.context, 2130970793, null);
          this.rme.put(Integer.valueOf(i), localObject2);
        }
        ImageView localImageView;
        if (i == j - 1)
        {
          localObject1 = "";
          localImageView = (ImageView)((View)localObject2).findViewById(2131822744);
          if (i != j - 1)
            break label403;
          if (this.rmj)
          {
            localImageView.setBackgroundResource(2130840253);
            localImageView.setContentDescription(getContext().getString(2131303591));
            localImageView.setImageDrawable(null);
            label312: if (this.rmi != null)
            {
              if (i != j - 1)
                break label499;
              ((View)localObject2).setTag(Integer.valueOf(-1));
              ((View)localObject2).setOnClickListener(this.rmi.rjy);
              ((View)localObject2).setClickable(true);
            }
          }
        }
        while (true)
        {
          ((View)localObject2).setLayoutParams(new TableRow.LayoutParams(-2, -2));
          localTableRow.addView((View)localObject2);
          i++;
          m++;
          break;
          localObject1 = (String)paramList.get(i);
          break label257;
          localImageView.setBackgroundDrawable(null);
          localImageView.setTag(localObject1);
          localImageView.setContentDescription(getContext().getString(2131303660));
          Bitmap localBitmap = (Bitmap)this.rmh.get(localObject1);
          if (!i.B(localBitmap))
          {
            ab.d("MicroMsg.PreviewImageView", "bm is null");
            new PreviewImageView.a(this, localImageView, (String)localObject1).u(new String[] { "" });
            break label312;
          }
          localImageView.setImageBitmap(localBitmap);
          break label312;
          label499: ((View)localObject2).setTag(Integer.valueOf(i));
          ((View)localObject2).setOnClickListener(this.rmi.rjy);
          ((View)localObject2).setClickable(true);
        }
        AppMethodBeat.o(38520);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.PreviewImageView
 * JD-Core Version:    0.6.2
 */