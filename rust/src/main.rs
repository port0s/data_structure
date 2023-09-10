use busca_binaria::busca_binaria;
use busca_sequencial::busca_sequencial;
use ex_rust::ex_rust;

mod busca_binaria;
mod busca_sequencial;
mod ex_rust;

fn main() {
    ex_rust();
    busca_sequencial();
    busca_binaria();
}
