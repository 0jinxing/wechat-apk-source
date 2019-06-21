package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.a.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class PathActionArgWrapper extends BaseDrawActionArg
{
  public static final Parcelable.Creator<PathActionArgWrapper> CREATOR;
  public List<BasePathActionArg> hdv;

  static
  {
    AppMethodBeat.i(103596);
    CREATOR = new PathActionArgWrapper.1();
    AppMethodBeat.o(103596);
  }

  public PathActionArgWrapper()
  {
    AppMethodBeat.i(103590);
    this.hdv = new ArrayList();
    AppMethodBeat.o(103590);
  }

  public PathActionArgWrapper(Parcel paramParcel)
  {
    this(paramParcel, (byte)0);
  }

  private PathActionArgWrapper(Parcel paramParcel, byte paramByte)
  {
    super(paramParcel);
    AppMethodBeat.i(103589);
    this.hdv = new ArrayList();
    this.hdv = paramParcel.readArrayList(PathActionArgWrapper.class.getClassLoader());
    AppMethodBeat.o(103589);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(103594);
    if (!super.equals(paramObject))
      AppMethodBeat.o(103594);
    while (true)
    {
      return bool;
      if ((paramObject instanceof PathActionArgWrapper))
      {
        paramObject = (PathActionArgWrapper)paramObject;
        bool = this.hdv.equals(paramObject.hdv);
        AppMethodBeat.o(103594);
      }
      else
      {
        AppMethodBeat.o(103594);
      }
    }
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103592);
    super.i(paramParcel);
    AppMethodBeat.o(103592);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103593);
    super.j(paramJSONObject);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("data");
    if ((localJSONArray == null) || (localJSONArray.length() == 0))
      AppMethodBeat.o(103593);
    while (true)
    {
      return;
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        paramJSONObject = localJSONArray.optJSONObject(i);
        Object localObject = paramJSONObject.optString("method");
        localObject = (BasePathActionArg)f.aym().yy((String)localObject);
        ((BasePathActionArg)localObject).j(paramJSONObject);
        this.hdv.add(localObject);
      }
      AppMethodBeat.o(103593);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(103591);
    super.reset();
    Iterator localIterator = this.hdv.iterator();
    while (localIterator.hasNext())
    {
      BasePathActionArg localBasePathActionArg = (BasePathActionArg)localIterator.next();
      f.aym().a(localBasePathActionArg);
    }
    this.hdv.clear();
    AppMethodBeat.o(103591);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103595);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeList(this.hdv);
    AppMethodBeat.o(103595);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper
 * JD-Core Version:    0.6.2
 */