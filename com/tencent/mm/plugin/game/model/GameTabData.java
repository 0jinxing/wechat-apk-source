package com.tencent.mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.commlib.a;
import com.tencent.mm.plugin.game.d.al;
import com.tencent.mm.plugin.game.d.dd;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class GameTabData
  implements Parcelable
{
  public static final Parcelable.Creator<GameTabData> CREATOR;
  public LinkedHashMap<String, GameTabData.TabItem> mYm;
  public GameTabData.StatusBar mYn;

  static
  {
    AppMethodBeat.i(111405);
    CREATOR = new GameTabData.1();
    AppMethodBeat.o(111405);
  }

  public GameTabData()
  {
    AppMethodBeat.i(111400);
    this.mYm = new LinkedHashMap();
    this.mYn = new GameTabData.StatusBar();
    AppMethodBeat.o(111400);
  }

  private GameTabData(Parcel paramParcel)
  {
    AppMethodBeat.i(111401);
    g(paramParcel);
    AppMethodBeat.o(111401);
  }

  public static GameTabData cc(List<al> paramList)
  {
    AppMethodBeat.i(111404);
    if (bo.ek(paramList))
    {
      paramList = null;
      AppMethodBeat.o(111404);
    }
    while (true)
    {
      return paramList;
      GameTabData localGameTabData = new GameTabData();
      Object localObject = a.bDg();
      if (localObject != null)
      {
        localGameTabData.mYn.mYo = ((dd)localObject).mYo;
        localGameTabData.mYn.color = c.parseColor(((dd)localObject).color);
      }
      Iterator localIterator = paramList.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        al localal = (al)localIterator.next();
        if ((localal != null) && (!bo.isNullOrNil(localal.naV)))
        {
          GameTabData.TabItem localTabItem = new GameTabData.TabItem();
          localTabItem.mYp = localal.naV;
          localTabItem.title = localal.Title;
          localTabItem.mYq = localal.naW;
          localTabItem.mYr = localal.naX;
          localTabItem.jumpUrl = localal.mZj;
          localTabItem.mYu = localal.naY;
          localTabItem.mYv = localal.naZ;
          if (localTabItem.mYr)
          {
            localTabItem.mYw = GameTabHomeUI.class.getName();
            localTabItem.mYx = false;
            localTabItem.cKG = localal.nba;
            localTabItem.mYy = localal.mZN;
            localTabItem.mVB = localal.mZL;
            localGameTabData.mYm.put(localTabItem.mYp, localTabItem);
          }
          else
          {
            int j = i % 3;
            localObject = new StringBuilder("com.tencent.mm.plugin.game.ui.tab.GameTabWebUI");
            if (j != 0);
            for (paramList = String.valueOf(j); ; paramList = "")
            {
              localTabItem.mYw = paramList;
              i++;
              break;
            }
          }
        }
      }
      AppMethodBeat.o(111404);
      paramList = localGameTabData;
    }
  }

  private void g(Parcel paramParcel)
  {
    AppMethodBeat.i(111402);
    int i = paramParcel.readInt();
    if (this.mYm == null)
      this.mYm = new LinkedHashMap();
    for (int j = 0; j < i; j++)
    {
      GameTabData.TabItem localTabItem = (GameTabData.TabItem)paramParcel.readParcelable(GameTabData.TabItem.class.getClassLoader());
      if (localTabItem != null)
        this.mYm.put(localTabItem.mYp, localTabItem);
    }
    this.mYn = ((GameTabData.StatusBar)paramParcel.readParcelable(GameTabData.StatusBar.class.getClassLoader()));
    AppMethodBeat.o(111402);
  }

  public int describeContents()
  {
    return 0;
  }

  public final List<GameTabData.TabItem> getItemList()
  {
    AppMethodBeat.i(111399);
    ArrayList localArrayList = new ArrayList();
    if (this.mYm != null)
      localArrayList.addAll(this.mYm.values());
    AppMethodBeat.o(111399);
    return localArrayList;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(111403);
    paramParcel.writeInt(this.mYm.size());
    Iterator localIterator = this.mYm.entrySet().iterator();
    while (localIterator.hasNext())
      paramParcel.writeParcelable((Parcelable)((Map.Entry)localIterator.next()).getValue(), paramInt);
    paramParcel.writeParcelable(this.mYn, paramInt);
    AppMethodBeat.o(111403);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.GameTabData
 * JD-Core Version:    0.6.2
 */