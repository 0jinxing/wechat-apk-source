package com.tencent.liteav.basic.module;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class a
{
  private String mID = "";

  public void clearID()
  {
    AppMethodBeat.i(66078);
    try
    {
      if (this.mID.length() != 0)
      {
        TXCStatus.b(this.mID);
        this.mID = "";
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(66078);
    }
  }

  public void finalize()
  {
    AppMethodBeat.i(66076);
    clearID();
    super.finalize();
    AppMethodBeat.o(66076);
  }

  public String getID()
  {
    return this.mID;
  }

  public Object getStatusValue(int paramInt)
  {
    AppMethodBeat.i(66080);
    Object localObject = TXCStatus.a(this.mID, paramInt);
    AppMethodBeat.o(66080);
    return localObject;
  }

  public void setID(String paramString)
  {
    AppMethodBeat.i(66077);
    clearID();
    try
    {
      if (paramString.length() != 0)
      {
        this.mID = paramString;
        TXCStatus.a(this.mID);
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(66077);
    }
    throw paramString;
  }

  public boolean setStatusValue(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(66079);
    boolean bool = TXCStatus.a(this.mID, paramInt, paramObject);
    AppMethodBeat.o(66079);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.module.a
 * JD-Core Version:    0.6.2
 */