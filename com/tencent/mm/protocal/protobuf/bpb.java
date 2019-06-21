package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bpb extends com.tencent.mm.bt.a
{
  public String SmallImgUrl;
  public String jBB;
  public String jCH;
  public int wRw;
  public String wfK;
  public String wlF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102516);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      paramArrayOfObject.iz(2, this.wRw);
      if (this.jCH != null)
        paramArrayOfObject.e(3, this.jCH);
      if (this.SmallImgUrl != null)
        paramArrayOfObject.e(4, this.SmallImgUrl);
      if (this.wfK != null)
        paramArrayOfObject.e(5, this.wfK);
      if (this.wlF != null)
        paramArrayOfObject.e(6, this.wlF);
      AppMethodBeat.o(102516);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label530;
    label530: for (paramInt = e.a.a.b.b.a.f(1, this.jBB) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wRw);
      paramInt = i;
      if (this.jCH != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.jCH);
      i = paramInt;
      if (this.SmallImgUrl != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.SmallImgUrl);
      paramInt = i;
      if (this.wfK != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wfK);
      i = paramInt;
      if (this.wlF != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wlF);
      AppMethodBeat.o(102516);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102516);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bpb localbpb = (bpb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102516);
          break;
        case 1:
          localbpb.jBB = locala.BTU.readString();
          AppMethodBeat.o(102516);
          paramInt = i;
          break;
        case 2:
          localbpb.wRw = locala.BTU.vd();
          AppMethodBeat.o(102516);
          paramInt = i;
          break;
        case 3:
          localbpb.jCH = locala.BTU.readString();
          AppMethodBeat.o(102516);
          paramInt = i;
          break;
        case 4:
          localbpb.SmallImgUrl = locala.BTU.readString();
          AppMethodBeat.o(102516);
          paramInt = i;
          break;
        case 5:
          localbpb.wfK = locala.BTU.readString();
          AppMethodBeat.o(102516);
          paramInt = i;
          break;
        case 6:
          localbpb.wlF = locala.BTU.readString();
          AppMethodBeat.o(102516);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102516);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpb
 * JD-Core Version:    0.6.2
 */