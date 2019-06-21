package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class azu extends com.tencent.mm.bt.a
{
  public String desc;
  public int duration;
  public int fga;
  public int fgb = 0;
  public int fgc;
  public String fgd;
  public String lvx;
  public int vGc = -1;
  public int videoHeight;
  public int videoWidth;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94536);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vGc);
      paramArrayOfObject.iz(2, this.fgb);
      if (this.desc != null)
        paramArrayOfObject.e(3, this.desc);
      paramArrayOfObject.iz(4, this.videoWidth);
      paramArrayOfObject.iz(5, this.videoHeight);
      paramArrayOfObject.iz(6, this.fga);
      paramArrayOfObject.iz(7, this.duration);
      if (this.fgd != null)
        paramArrayOfObject.e(8, this.fgd);
      paramArrayOfObject.iz(9, this.fgc);
      if (this.lvx != null)
        paramArrayOfObject.e(10, this.lvx);
      AppMethodBeat.o(94536);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vGc) + 0 + e.a.a.b.b.a.bs(2, this.fgb);
        paramInt = i;
        if (this.desc != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.desc);
        i = paramInt + e.a.a.b.b.a.bs(4, this.videoWidth) + e.a.a.b.b.a.bs(5, this.videoHeight) + e.a.a.b.b.a.bs(6, this.fga) + e.a.a.b.b.a.bs(7, this.duration);
        paramInt = i;
        if (this.fgd != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.fgd);
        i = paramInt + e.a.a.b.b.a.bs(9, this.fgc);
        paramInt = i;
        if (this.lvx != null)
          paramInt = i + e.a.a.b.b.a.f(10, this.lvx);
        AppMethodBeat.o(94536);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94536);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        azu localazu = (azu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94536);
          break;
        case 1:
          localazu.vGc = locala.BTU.vd();
          AppMethodBeat.o(94536);
          paramInt = 0;
          break;
        case 2:
          localazu.fgb = locala.BTU.vd();
          AppMethodBeat.o(94536);
          paramInt = 0;
          break;
        case 3:
          localazu.desc = locala.BTU.readString();
          AppMethodBeat.o(94536);
          paramInt = 0;
          break;
        case 4:
          localazu.videoWidth = locala.BTU.vd();
          AppMethodBeat.o(94536);
          paramInt = 0;
          break;
        case 5:
          localazu.videoHeight = locala.BTU.vd();
          AppMethodBeat.o(94536);
          paramInt = 0;
          break;
        case 6:
          localazu.fga = locala.BTU.vd();
          AppMethodBeat.o(94536);
          paramInt = 0;
          break;
        case 7:
          localazu.duration = locala.BTU.vd();
          AppMethodBeat.o(94536);
          paramInt = 0;
          break;
        case 8:
          localazu.fgd = locala.BTU.readString();
          AppMethodBeat.o(94536);
          paramInt = 0;
          break;
        case 9:
          localazu.fgc = locala.BTU.vd();
          AppMethodBeat.o(94536);
          paramInt = 0;
          break;
        case 10:
          localazu.lvx = locala.BTU.readString();
          AppMethodBeat.o(94536);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94536);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.azu
 * JD-Core Version:    0.6.2
 */