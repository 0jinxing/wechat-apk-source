package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class DrawCanvasArg
  implements Parcelable
{
  public static final Parcelable.Creator<DrawCanvasArg> CREATOR;
  public boolean hdU;
  public String hdV;
  public long hdW;
  public boolean hdX;
  public JSONArray hdY;
  public volatile Runnable hdZ;
  public List<DrawActionWrapper> hdv;
  private volatile boolean hea;
  public volatile boolean heb;
  protected volatile int hec;
  protected volatile int hed;

  static
  {
    AppMethodBeat.i(103710);
    CREATOR = new DrawCanvasArg.2();
    AppMethodBeat.o(103710);
  }

  public DrawCanvasArg()
  {
    AppMethodBeat.i(103702);
    this.hdv = new ArrayList();
    this.hea = false;
    this.heb = false;
    AppMethodBeat.o(103702);
  }

  public DrawCanvasArg(Parcel paramParcel)
  {
    AppMethodBeat.i(103703);
    this.hdv = new ArrayList();
    this.hea = false;
    this.heb = false;
    if (paramParcel.readInt() == 1)
    {
      bool2 = true;
      this.hdU = bool2;
      this.hdV = paramParcel.readString();
      this.hdv = paramParcel.readArrayList(DrawCanvasArg.class.getClassLoader());
      this.hdW = paramParcel.readLong();
      if (paramParcel.readInt() != 1)
        break label102;
    }
    label102: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hdX = bool2;
      AppMethodBeat.o(103703);
      return;
      bool2 = false;
      break;
    }
  }

  private void release()
  {
    try
    {
      AppMethodBeat.i(103706);
      ab.i("DrawCanvasArg", "release %s", new Object[] { toString() });
      this.hed = 0;
      this.hec = 0;
      this.hdZ = null;
      this.hdU = false;
      this.hdY = null;
      this.hdV = null;
      this.hdW = 0L;
      this.hdX = false;
      this.hea = false;
      this.heb = false;
      Iterator localIterator = this.hdv.iterator();
      while (localIterator.hasNext())
      {
        DrawActionWrapper localDrawActionWrapper = (DrawActionWrapper)localIterator.next();
        if (localDrawActionWrapper != null)
          localDrawActionWrapper.reset();
        localIterator.remove();
      }
    }
    finally
    {
    }
    com.tencent.mm.plugin.appbrand.canvas.action.arg.a.d.ayk().hdz.release(this);
    AppMethodBeat.o(103706);
  }

  public int describeContents()
  {
    return 0;
  }

  public final void h(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103704);
    int i = 0;
    if ((i < paramJSONArray.length()) && (!this.hea))
    {
      JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
      BaseDrawActionArg localBaseDrawActionArg = com.tencent.mm.plugin.appbrand.canvas.action.arg.a.c.ayj().yy(localJSONObject.optString("method"));
      localObject1 = (DrawActionWrapper)com.tencent.mm.plugin.appbrand.canvas.action.arg.a.d.ayk().hdA.aA();
      localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = new DrawActionWrapper();
      if (localBaseDrawActionArg != null)
      {
        ((DrawActionWrapper)localObject2).type = 2;
        localBaseDrawActionArg.j(localJSONObject);
        ((DrawActionWrapper)localObject2).hcP = localBaseDrawActionArg;
      }
      while (true)
      {
        this.hdv.add(localObject2);
        i++;
        break;
        ((DrawActionWrapper)localObject2).type = 1;
        ((DrawActionWrapper)localObject2).hcQ = localJSONObject;
      }
    }
    Object localObject2 = new LinkedList();
    Object localObject1 = new ArrayList();
    this.hed += this.hdv.size();
    int j = this.hdv.size() - 1;
    i = 0;
    if (j >= 0)
    {
      paramJSONArray = (DrawActionWrapper)this.hdv.get(j);
      boolean bool;
      switch (paramJSONArray.type)
      {
      default:
        bool = false;
        label231: if (bool)
        {
          ab.i("DrawCanvasArg", "found redudant method %s", new Object[] { paramJSONArray.getMethod() });
          ((List)localObject1).add(paramJSONArray);
          i++;
        }
        break;
      case 1:
      case 2:
      }
      while (true)
      {
        j--;
        break;
        bool = false;
        break label231;
        bool = paramJSONArray.hcP.ayg();
        break label231;
        if ("save".equals(paramJSONArray.getMethod()))
        {
          if ((((LinkedList)localObject2).size() > 0) && (((DrawActionWrapper)((LinkedList)localObject2).getLast()).getMethod().equals("restore")))
          {
            ((List)localObject1).add(paramJSONArray);
            ((List)localObject1).add(((LinkedList)localObject2).removeLast());
          }
          else
          {
            do
              if (((LinkedList)localObject2).size() <= 0)
                break;
            while (!((DrawActionWrapper)((LinkedList)localObject2).removeLast()).getMethod().equals("restore"));
          }
        }
        else
          ((LinkedList)localObject2).addLast(paramJSONArray);
      }
    }
    this.hec += ((List)localObject1).size();
    localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      paramJSONArray = (DrawActionWrapper)((Iterator)localObject2).next();
      this.hdv.remove(paramJSONArray);
      paramJSONArray.reset();
    }
    ab.i("DrawCanvasArg", "optimize save&restore %d times, redudant count %d, allOpCount %d ", new Object[] { Integer.valueOf(this.hec), Integer.valueOf(i), Integer.valueOf(this.hed) });
    AppMethodBeat.o(103704);
  }

  public final void reset()
  {
    AppMethodBeat.i(103705);
    if ((this.hdZ != null) && (!com.tencent.mm.sdk.g.d.xDG.remove(this.hdZ)))
    {
      ab.i("DrawCanvasArg", "wait for async over");
      this.hea = true;
      AppMethodBeat.o(103705);
    }
    while (true)
    {
      return;
      release();
      AppMethodBeat.o(103705);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(103707);
    if (this.hdU)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.hdV);
      paramParcel.writeList(this.hdv);
      paramParcel.writeLong(this.hdW);
      if (!this.hdX)
        break label72;
    }
    label72: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(103707);
      return;
      paramInt = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg
 * JD-Core Version:    0.6.2
 */