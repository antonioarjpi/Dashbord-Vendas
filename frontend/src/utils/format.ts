export const roud = (value: number, precision: number) =>{
    var mulplier = Math.pow(10, precision || 0);
    return Math.round(value*mulplier) / mulplier;
}