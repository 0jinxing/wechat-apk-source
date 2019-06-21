package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bl;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import junit.framework.Assert;

final class ReaderItemListView$a extends BaseAdapter
{
  ReaderItemListView$a(ReaderItemListView paramReaderItemListView)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(76859);
    int i = ReaderItemListView.a(this.pFE).size();
    AppMethodBeat.o(76859);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(76860);
    Object localObject = ReaderItemListView.a(this.pFE).get(paramInt);
    AppMethodBeat.o(76860);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(76861);
    String str2;
    if (((bl)ReaderItemListView.a(this.pFE).get(paramInt)).type == 20)
      if (paramInt == 0)
      {
        String str1 = ((bl)ReaderItemListView.a(this.pFE).get(paramInt)).aan();
        str2 = ((bl)ReaderItemListView.a(this.pFE).get(paramInt)).getDigest();
        if (bo.isNullOrNil(str1))
          if (bo.isNullOrNil(str2))
          {
            AppMethodBeat.o(76861);
            paramInt = 1;
          }
      }
    while (true)
    {
      return paramInt;
      paramInt = 2;
      AppMethodBeat.o(76861);
      continue;
      if (bo.isNullOrNil(str2))
      {
        paramInt = 3;
        AppMethodBeat.o(76861);
      }
      else
      {
        paramInt = 0;
        AppMethodBeat.o(76861);
        continue;
        AppMethodBeat.o(76861);
        paramInt = 1;
        continue;
        if (paramInt == 0)
        {
          if (getCount() == 1)
          {
            paramInt = 8;
            AppMethodBeat.o(76861);
          }
          else
          {
            paramInt = 6;
            AppMethodBeat.o(76861);
          }
        }
        else if (paramInt == getCount() - 1)
        {
          paramInt = 7;
          AppMethodBeat.o(76861);
        }
        else
        {
          paramInt = 5;
          AppMethodBeat.o(76861);
        }
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = null;
    AppMethodBeat.i(76862);
    int i = getItemViewType(paramInt);
    boolean bool;
    if (paramView == null)
      switch (i)
      {
      default:
        if (paramViewGroup != null)
        {
          bool = true;
          label79: Assert.assertTrue(bool);
          if (paramViewGroup.gsf == null)
            break label1204;
          bool = true;
          label94: Assert.assertTrue(bool);
          paramViewGroup.gsf.setText(((bl)ReaderItemListView.a(this.pFE).get(paramInt)).getTitle().trim());
          if (paramViewGroup.pFH != null)
            paramViewGroup.pFH.setText(((bl)ReaderItemListView.a(this.pFE).get(paramInt)).getDigest().trim());
          if (paramViewGroup.ngn != null)
            paramViewGroup.ngn.setText(((bl)ReaderItemListView.a(this.pFE).get(paramInt)).aal().trim() + this.pFE.getContext().getString(2131302152));
          Bitmap localBitmap;
          if (paramViewGroup.iNr != null)
          {
            localBitmap = x.a(new q(((bl)ReaderItemListView.a(this.pFE).get(paramInt)).aam(), ((bl)ReaderItemListView.a(this.pFE).get(paramInt)).type, "@S"));
            if (localBitmap == null)
              break label1210;
            paramViewGroup.iNr.setImageBitmap(localBitmap);
            paramViewGroup.iNr.setVisibility(0);
            paramViewGroup.pFI.setVisibility(8);
          }
          label318: if (paramViewGroup.jOX != null)
          {
            localBitmap = x.a(new q(((bl)ReaderItemListView.a(this.pFE).get(paramInt)).aan(), ((bl)ReaderItemListView.a(this.pFE).get(paramInt)).type, "@T"));
            if (localBitmap == null)
              break label1230;
            paramViewGroup.jOX.setImageBitmap(localBitmap);
            paramViewGroup.jOX.setVisibility(0);
            paramViewGroup.progressBar.setVisibility(8);
          }
        }
        break;
      case 1:
      case 2:
      case 0:
      case 3:
      case 4:
      case 5:
      case 6:
      case 8:
      case 7:
      }
    while (true)
    {
      if ((paramViewGroup.jPn != null) && (ReaderItemListView.c(this.pFE) != null))
      {
        paramViewGroup.jPn.setTag(Integer.valueOf(ReaderItemListView.d(this.pFE)));
        paramViewGroup.jPn.setOnLongClickListener(new ReaderItemListView.a.1(this));
        paramViewGroup.jPn.setOnClickListener(new ReaderItemListView.a.2(this, paramInt));
      }
      AppMethodBeat.o(76862);
      return paramView;
      paramViewGroup = new ReaderItemListView.a.a(this);
      paramView = ReaderItemListView.b(this.pFE).inflate(2130970449, null);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131826830));
      paramView.setTag(paramViewGroup);
      break;
      paramViewGroup = new ReaderItemListView.a.a(this);
      paramView = ReaderItemListView.b(this.pFE).inflate(2130970446, null);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131826819));
      paramViewGroup.pFH = ((TextView)paramView.findViewById(2131826820));
      paramView.setTag(paramViewGroup);
      break;
      paramViewGroup = new ReaderItemListView.a.a(this);
      paramView = ReaderItemListView.b(this.pFE).inflate(2130970445, null);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131826819));
      paramViewGroup.jOX = ((ImageView)paramView.findViewById(2131826817));
      paramViewGroup.progressBar = ((ProgressBar)paramView.findViewById(2131826818));
      paramView.setTag(paramViewGroup);
      break;
      paramViewGroup = new ReaderItemListView.a.a(this);
      paramView = ReaderItemListView.b(this.pFE).inflate(2130970452, null);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131826819));
      paramViewGroup.jOX = ((ImageView)paramView.findViewById(2131826817));
      paramViewGroup.progressBar = ((ProgressBar)paramView.findViewById(2131826818));
      paramViewGroup.ngn = ((TextView)paramView.findViewById(2131826840));
      paramViewGroup.iNr = ((ImageView)paramView.findViewById(2131826838));
      paramViewGroup.pFI = ((ProgressBar)paramView.findViewById(2131826839));
      paramViewGroup.jPn = paramView.findViewById(2131826837);
      paramViewGroup.jPn.setBackgroundResource(2130838290);
      paramView.setTag(paramViewGroup);
      break;
      paramViewGroup = new ReaderItemListView.a.a(this);
      paramView = ReaderItemListView.b(this.pFE).inflate(2130970453, null);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131826819));
      paramViewGroup.ngn = ((TextView)paramView.findViewById(2131826840));
      paramViewGroup.iNr = ((ImageView)paramView.findViewById(2131826838));
      paramViewGroup.pFI = ((ProgressBar)paramView.findViewById(2131826839));
      paramViewGroup.jPn = paramView.findViewById(2131826837);
      paramViewGroup.jPn.setBackgroundResource(2130838289);
      paramView.setTag(paramViewGroup);
      break;
      paramViewGroup = new ReaderItemListView.a.a(this);
      paramView = ReaderItemListView.b(this.pFE).inflate(2130970455, null);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131826819));
      paramViewGroup.ngn = ((TextView)paramView.findViewById(2131826840));
      paramViewGroup.iNr = ((ImageView)paramView.findViewById(2131826838));
      paramViewGroup.pFI = ((ProgressBar)paramView.findViewById(2131826839));
      paramViewGroup.jPn = paramView.findViewById(2131826837);
      paramViewGroup.jPn.setBackgroundResource(2130838290);
      paramView.setTag(paramViewGroup);
      break;
      paramViewGroup = new ReaderItemListView.a.a(this);
      paramView = ReaderItemListView.b(this.pFE).inflate(2130970453, null);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131826819));
      paramViewGroup.ngn = ((TextView)paramView.findViewById(2131826840));
      paramViewGroup.iNr = ((ImageView)paramView.findViewById(2131826838));
      paramViewGroup.pFI = ((ProgressBar)paramView.findViewById(2131826839));
      paramViewGroup.jPn = paramView.findViewById(2131826837);
      paramViewGroup.jPn.setBackgroundResource(2130838291);
      paramView.setTag(paramViewGroup);
      break;
      paramViewGroup = new ReaderItemListView.a.a(this);
      paramView = ReaderItemListView.b(this.pFE).inflate(2130970454, null);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131826819));
      paramViewGroup.ngn = ((TextView)paramView.findViewById(2131826840));
      paramViewGroup.iNr = ((ImageView)paramView.findViewById(2131826838));
      paramViewGroup.pFI = ((ProgressBar)paramView.findViewById(2131826839));
      paramViewGroup.jPn = paramView.findViewById(2131826837);
      paramViewGroup.jPn.setBackgroundResource(2130838288);
      paramView.setTag(paramViewGroup);
      break;
      paramViewGroup = (ReaderItemListView.a.a)paramView.getTag();
      break;
      bool = false;
      break label79;
      label1204: bool = false;
      break label94;
      label1210: paramViewGroup.pFI.setVisibility(0);
      paramViewGroup.iNr.setVisibility(8);
      break label318;
      label1230: paramViewGroup.progressBar.setVisibility(0);
      paramViewGroup.jOX.setVisibility(8);
    }
  }

  public final int getViewTypeCount()
  {
    return 9;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderItemListView.a
 * JD-Core Version:    0.6.2
 */