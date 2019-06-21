package com.tencent.mm.plugin.remittance.bankcard.model;

import android.util.Pair;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class c$a extends Filter
{
  List<TransferRecordParcel> pLY;

  private c$a(c paramc)
  {
    AppMethodBeat.i(44500);
    this.pLY = new ArrayList();
    AppMethodBeat.o(44500);
  }

  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(44501);
    this.pLY.clear();
    c.a(this.pLZ).clear();
    ab.d("MicroMsg.PayeeAutoCompleteAdapter", "input: %s", new Object[] { paramCharSequence });
    Iterator localIterator = c.b(this.pLZ).iterator();
    while (localIterator.hasNext())
    {
      TransferRecordParcel localTransferRecordParcel = (TransferRecordParcel)localIterator.next();
      if ((!bo.ac(paramCharSequence)) && (localTransferRecordParcel.pMf.contains(paramCharSequence)))
      {
        int i = localTransferRecordParcel.pMf.indexOf((String)paramCharSequence);
        int j = paramCharSequence.length() + i;
        ab.i("MicroMsg.PayeeAutoCompleteAdapter", "match payee: %s, start: %s, end: %s", new Object[] { localTransferRecordParcel.pMf, Integer.valueOf(i), Integer.valueOf(j) });
        Pair localPair = new Pair(Integer.valueOf(i), Integer.valueOf(j));
        c.a(this.pLZ).add(localPair);
        this.pLY.add(localTransferRecordParcel);
      }
    }
    paramCharSequence = new Filter.FilterResults();
    paramCharSequence.count = this.pLY.size();
    paramCharSequence.values = this.pLY;
    AppMethodBeat.o(44501);
    return paramCharSequence;
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    AppMethodBeat.i(44502);
    c.a(this.pLZ, (List)paramFilterResults.values);
    ab.i("MicroMsg.PayeeAutoCompleteAdapter", "match count: %d", new Object[] { Integer.valueOf(c.c(this.pLZ).size()) });
    this.pLZ.notifyDataSetChanged();
    AppMethodBeat.o(44502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.model.c.a
 * JD-Core Version:    0.6.2
 */