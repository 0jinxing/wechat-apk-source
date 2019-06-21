package com.samsung.android.sdk.look.airbutton;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class SlookAirButtonAdapter
{
  private CharSequence mEmptyText;
  private ArrayList<SlookAirButtonAdapter.AirButtonItem> mItemList;

  public SlookAirButtonAdapter()
  {
    this.mItemList = null;
  }

  public SlookAirButtonAdapter(ArrayList<SlookAirButtonAdapter.AirButtonItem> paramArrayList)
  {
    AppMethodBeat.i(117242);
    this.mItemList = null;
    addItem(paramArrayList);
    AppMethodBeat.o(117242);
  }

  public int addItem(ArrayList<SlookAirButtonAdapter.AirButtonItem> paramArrayList)
  {
    AppMethodBeat.i(117244);
    if (this.mItemList != null)
      this.mItemList.clear();
    this.mItemList = paramArrayList;
    int i = this.mItemList.size();
    AppMethodBeat.o(117244);
    return i - 1;
  }

  public void addItem(SlookAirButtonAdapter.AirButtonItem paramAirButtonItem)
  {
    AppMethodBeat.i(117243);
    if (this.mItemList == null)
      this.mItemList = new ArrayList();
    this.mItemList.add(paramAirButtonItem);
    AppMethodBeat.o(117243);
  }

  public void clear()
  {
    AppMethodBeat.i(117248);
    if (this.mItemList == null)
      AppMethodBeat.o(117248);
    while (true)
    {
      return;
      this.mItemList.clear();
      AppMethodBeat.o(117248);
    }
  }

  public int getCount()
  {
    AppMethodBeat.i(117249);
    int i;
    if (this.mItemList == null)
    {
      i = 0;
      AppMethodBeat.o(117249);
    }
    while (true)
    {
      return i;
      i = this.mItemList.size();
      AppMethodBeat.o(117249);
    }
  }

  public CharSequence getEmptyText()
  {
    return this.mEmptyText;
  }

  public SlookAirButtonAdapter.AirButtonItem getItem(int paramInt)
  {
    AppMethodBeat.i(117250);
    SlookAirButtonAdapter.AirButtonItem localAirButtonItem;
    if ((this.mItemList != null) && (paramInt < this.mItemList.size()))
    {
      localAirButtonItem = (SlookAirButtonAdapter.AirButtonItem)this.mItemList.get(paramInt);
      AppMethodBeat.o(117250);
    }
    while (true)
    {
      return localAirButtonItem;
      localAirButtonItem = null;
      AppMethodBeat.o(117250);
    }
  }

  public void insertItem(int paramInt, SlookAirButtonAdapter.AirButtonItem paramAirButtonItem)
  {
    AppMethodBeat.i(117245);
    if (this.mItemList == null)
      if (paramInt == 0)
      {
        addItem(paramAirButtonItem);
        AppMethodBeat.o(117245);
      }
    while (true)
    {
      return;
      paramAirButtonItem = new IllegalArgumentException("The list is empty.");
      AppMethodBeat.o(117245);
      throw paramAirButtonItem;
      this.mItemList.add(paramInt, paramAirButtonItem);
      AppMethodBeat.o(117245);
    }
  }

  public void onDismiss(View paramView)
  {
  }

  public void onHide(View paramView)
  {
  }

  public boolean onHoverEnter(View paramView)
  {
    return true;
  }

  public void onHoverExit(View paramView)
  {
  }

  public void onShow(View paramView)
  {
  }

  public void removeItem(int paramInt)
  {
    AppMethodBeat.i(117246);
    if (this.mItemList == null)
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("The list is empty.");
      AppMethodBeat.o(117246);
      throw localIllegalArgumentException;
    }
    this.mItemList.remove(paramInt);
    AppMethodBeat.o(117246);
  }

  public void setEmptyText(CharSequence paramCharSequence)
  {
    this.mEmptyText = paramCharSequence;
  }

  public void updateItem(int paramInt, SlookAirButtonAdapter.AirButtonItem paramAirButtonItem)
  {
    AppMethodBeat.i(117247);
    if (this.mItemList == null)
    {
      paramAirButtonItem = new IllegalArgumentException("The list is empty.");
      AppMethodBeat.o(117247);
      throw paramAirButtonItem;
    }
    this.mItemList.set(paramInt, paramAirButtonItem);
    AppMethodBeat.o(117247);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.airbutton.SlookAirButtonAdapter
 * JD-Core Version:    0.6.2
 */