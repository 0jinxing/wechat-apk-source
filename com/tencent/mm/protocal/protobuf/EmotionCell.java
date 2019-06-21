package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class EmotionCell extends com.tencent.mm.bt.a
{
  public String CellTitle;
  public String IconUrl;
  public int Position;
  public int ReqType;
  public String TagUrl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62536);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.CellTitle != null)
        paramArrayOfObject.e(1, this.CellTitle);
      paramArrayOfObject.iz(2, this.ReqType);
      paramArrayOfObject.iz(3, this.Position);
      if (this.IconUrl != null)
        paramArrayOfObject.e(4, this.IconUrl);
      if (this.TagUrl != null)
        paramArrayOfObject.e(5, this.TagUrl);
      AppMethodBeat.o(62536);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.CellTitle == null)
        break label447;
    label447: for (paramInt = e.a.a.b.b.a.f(1, this.CellTitle) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ReqType) + e.a.a.b.b.a.bs(3, this.Position);
      paramInt = i;
      if (this.IconUrl != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.IconUrl);
      i = paramInt;
      if (this.TagUrl != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.TagUrl);
      AppMethodBeat.o(62536);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62536);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        EmotionCell localEmotionCell = (EmotionCell)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62536);
          break;
        case 1:
          localEmotionCell.CellTitle = locala.BTU.readString();
          AppMethodBeat.o(62536);
          paramInt = i;
          break;
        case 2:
          localEmotionCell.ReqType = locala.BTU.vd();
          AppMethodBeat.o(62536);
          paramInt = i;
          break;
        case 3:
          localEmotionCell.Position = locala.BTU.vd();
          AppMethodBeat.o(62536);
          paramInt = i;
          break;
        case 4:
          localEmotionCell.IconUrl = locala.BTU.readString();
          AppMethodBeat.o(62536);
          paramInt = i;
          break;
        case 5:
          localEmotionCell.TagUrl = locala.BTU.readString();
          AppMethodBeat.o(62536);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62536);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.EmotionCell
 * JD-Core Version:    0.6.2
 */